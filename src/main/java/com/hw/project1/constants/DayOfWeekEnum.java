package com.hw.project1.constants;

public enum DayOfWeekEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int value;

    DayOfWeekEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DayOfWeekEnum fromValue(int value) {
        for (DayOfWeekEnum day : values()) {
            if (day.value == value) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid value for day of week: " + value);
    }
}