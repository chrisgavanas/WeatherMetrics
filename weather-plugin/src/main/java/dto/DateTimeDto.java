package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateTimeDto {

    @JsonProperty("pretty")
    private String date;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("mon")
    private Integer month;

    @JsonProperty("mday")
    private Integer day;

    @JsonProperty("hour")
    private Integer hour;

    @JsonProperty("min")
    private Integer minute;

    @JsonProperty("tzname")
    private String zone;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

}
