package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeaturesDto {

    @JsonProperty("history")
    private Integer history;

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

}
