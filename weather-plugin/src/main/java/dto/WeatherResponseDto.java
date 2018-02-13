package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponseDto {

    @JsonProperty("response")
    private ResponseDto response;

    @JsonProperty("history")
    private HistoryDto history;

    public ResponseDto getResponse() {
        return response;
    }

    public void setResponse(ResponseDto response) {
        this.response = response;
    }

    public HistoryDto getHistory() {
        return history;
    }

    public void setHistory(HistoryDto history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return history.toString();
    }

}
