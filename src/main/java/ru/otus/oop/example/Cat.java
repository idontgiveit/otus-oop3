package ru.otus.oop.example;

public class Cat extends Animal{
    private String name;
    private String color;

    private static int weight;

    static {
        int a = 5;
        weight = 10 + a;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.tail = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getWeight() {
        System.out.println("CAT");
        return weight;

    }

    public static void setWeight(int weight) {
        Cat.weight = weight;
    }

    public void info() {
        System.out.println(name + " " + color + " " + weight);
    }
}
