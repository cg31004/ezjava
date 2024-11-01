package com.hw.project1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaiwanSchedule {
    @JsonProperty("date")
    private String date;
    @JsonProperty("week")
    private String week;
    @JsonProperty("isHoliday")
    private boolean isHoliday;
    @JsonProperty("description")
    private String description;

    public String getDate() {
        return date;
    }

    public boolean isHoliday() {
        return isHoliday;
    }


}
