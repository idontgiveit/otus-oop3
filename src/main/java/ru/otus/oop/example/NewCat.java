package ru.otus.oop.example;

public class NewCat extends Cat{
    public NewCat(String name, String color) {
        super(name, color);
    }


    public static int getWeight() {
        System.out.println("New cat");
        return 0;
    }
}
