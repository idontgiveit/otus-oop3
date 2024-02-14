package ru.otus.oop.example.competition;

public class Competition {

    int distance;

    public Competition(int distance) {
        this.distance = distance;
    }

    public void runAll(Runner[] competitors) {
        for (Runner competitor : competitors) {
            competitor.run(distance);
        }

    }


}
