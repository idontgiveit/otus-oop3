package ru.otus.oop.example.competition;

public interface Runner {
    boolean run(int distance);

    int SOME_CONST = 10;

    default void sayHelloAll() {
        System.out.println("Hello ALL");
    }


}
