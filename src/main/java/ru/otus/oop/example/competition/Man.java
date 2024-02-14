package ru.otus.oop.example.competition;

public class Man implements Runner, FlyerToSpace {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        System.out.println(name +  " не умеет бегать");
        return false;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public void lookAtStars() {
        System.out.println("Cool!");
    }
}
