package ru.otus.oop.example;

public class Day {
    DayOfWeek dayOfTheWeek;

    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public Day(DayOfWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public DayOfWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayStr() {
        return dayOfTheWeek.toString();
    }
}
