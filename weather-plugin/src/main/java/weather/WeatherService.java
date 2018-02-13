package weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.WeatherResponseDto;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class WeatherService {

    public static String WEATHER_URL = "http://api.wunderground.com/api/%s/history_20171030/q/NY/New_York.json";

    /***
     * Method integrations with wunderground API service and fetches the weather of the date 30 October 2017.
     * In case the service is unavailable or network issues occur, some cached data will be returned from a
     * last call.
     *
     * @return Max percentage humidity, Max Temp in C, Min Temp in C and Precipitation in mm
     * concatenated in a string (every attribute in a new line).
     */
    public String fetchWeatherData() {

        String result = "";
        String apiKey = loadApiKey();
        RestTemplate restTemplate = new RestTemplate();
        try {
            WeatherResponseDto weatherResponseDto = restTemplate.getForObject(String.format(WEATHER_URL, apiKey), WeatherResponseDto.class);
            result = weatherResponseDto.toString();
        } catch (RestClientException e) {
            result = loadMockedData();
        }

        return result;
    }

    /*
     * Loads API Key that authenticated the application from the property file
     */
    private String loadApiKey() {

        InputStream inputStream = null;
        Properties properties = new Properties();

        try {
            ClassPathResource classPathResource = new ClassPathResource("default.properties");
            inputStream = classPathResource.getInputStream();
            properties.load(inputStream);
            Optional.ofNullable(properties.getProperty("api.key")).orElseThrow(IOException::new);
        } catch (IOException e) {
            System.err.println("Property file or properties are missing, terminating...");
            System.exit(-1);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }

        return properties.getProperty("api.key");
    }

    /*
     * Loads cached data from a previous call
     */
    private String loadMockedData() {
        WeatherResponseDto weatherResponseDto = null;
        ObjectMapper objectMapper = new ObjectMapper();
        ClassPathResource classPathResource = new ClassPathResource("mocks/response.json");
        InputStream inputStream = null;

        try {
            inputStream = classPathResource.getInputStream();
            weatherResponseDto = objectMapper.readValue(inputStream, WeatherResponseDto.class);
        } catch (IOException e) {
            System.err.println("Service unavailable and no mocked data found, terminating...");
        } finally {
            IOUtils.closeQuietly(inputStream);
        }

        return weatherResponseDto == null ? "" : weatherResponseDto.toString();
    }

}
