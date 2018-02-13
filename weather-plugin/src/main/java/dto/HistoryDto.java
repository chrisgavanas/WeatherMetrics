package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HistoryDto {

    @JsonProperty("date")
    private DateTimeDto localDateTime;

    @JsonProperty("utcdate")
    private DateTimeDto utcDateTime;

    @JsonProperty("observations")
    private List<ObservationDto> observations;

    @JsonProperty("dailysummary")
    private List<DailySummaryDto> dailySummaries;

    public DateTimeDto getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(DateTimeDto localDateTime) {
        this.localDateTime = localDateTime;
    }

    public DateTimeDto getUtcDateTime() {
        return utcDateTime;
    }

    public void setUtcDateTime(DateTimeDto utcDateTime) {
        this.utcDateTime = utcDateTime;
    }

    public List<DailySummaryDto> getDailySummaries() {
        return dailySummaries;
    }

    public void setDailySummaries(List<DailySummaryDto> dailySummaries) {
        this.dailySummaries = dailySummaries;
    }

    @Override
    public String toString() {
        return dailySummaries.get(0).toString();
    }
}
