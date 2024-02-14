package ru.otus.oop.example.competition;

public class HedgeHog implements Runner{
    int power;

    public HedgeHog(int power) {
        this.power = power;
    }

    @Override
    public boolean run(int distance) {
        boolean result = power * 200 >= distance;
        System.out.println("Еж бежал distance " + result);
        return result;
    }
}
