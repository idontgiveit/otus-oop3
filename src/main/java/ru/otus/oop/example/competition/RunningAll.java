package ru.otus.oop.example.competition;

public class RunningAll {
    public static void main(String[] args) {

        RunningCat cat = new RunningCat("barsik", "black");
        HedgeHog hog = new HedgeHog(10);
        Robot robot = new Robot();
        Man man = new Man("Ivan");

        System.out.println(Runner.SOME_CONST);

        man.lookAtStars();

        robot.fly();

        Competition competition = new Competition(3000);
        competition.runAll(new Runner[] {cat, hog, robot, man});

        robot.sayHelloAll();
        hog.sayHelloAll();

    }
}
