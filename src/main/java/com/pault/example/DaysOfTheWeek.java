package com.pault.example;

public enum DaysOfTheWeek {

    SUNDAY(0, 1.1),
    MONDAY(1, 2.2),
    TUESDAY(2, 3.3),
    WEDNESDAY(3, 4.4),
    THURSDAY(4, 5.5),
    FRIDAY(5, 6.7),
    SATURDAY(6, 7.1);

    final Integer dayLevel;
    final Double cost;

    DaysOfTheWeek(int dayLevel, double cost) {
        this.dayLevel = dayLevel;
        this.cost = cost;
    }
}
