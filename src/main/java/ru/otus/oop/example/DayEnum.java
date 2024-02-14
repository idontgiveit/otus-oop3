package ru.otus.oop.example;

public class DayEnum {
    public String name;
    public int number;

    public DayEnum(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static final DayEnum FRI = new DayEnum("FRI", 5);

    @Override
    public String toString() {
        return "DayEnum{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
