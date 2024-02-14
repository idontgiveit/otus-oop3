package ru.otus.oop.example.competition;

public class RunningCat implements Runner{
    private String name;
    private String color;
    private int runAbility = 2000;

    public RunningCat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean run(int distance) {
        boolean result = runAbility >= distance;
        System.out.println("Кот бежал distance " + result);
        return result;
    }
}
