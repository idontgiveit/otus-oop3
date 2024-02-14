package ru.otus.oop.example.competition;

public class Robot implements Runner, Flyer {
    private int id;

    @Override
    public boolean run(int distance) {
        System.out.println("Робот пробежал");
        return true;
    }

    @Override
    public boolean fly() {
        System.out.println("Полетел");
        return true;
    }

    @Override
    public void sayHelloAll() {
        System.out.println("Kill all human");
    }
}
