package main;

import org.apache.commons.io.FileUtils;
import weather.WeatherService;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {


    /***
     * Fetches the weather of the date 30 October 2017 and redirects the output
     * to 'metrics.txt' of the same folder.
     * @param args
     */
    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService();
        String out = weatherService.fetchWeatherData();

        try {
            FileUtils.writeStringToFile(new File("./metrics.txt"), out, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Could not write to file, printing in console...");
            System.out.println(out);
        }
    }

}
