package de.merit.azubi.java21;

public class Gugu {

    static final int DAYS_IN_WEEK = 7;

    int zahl = 1;
    String name = "gugu";
    FlugRoboter flyFly = new FlugRoboter();
    TauchRoboter blubBlub = new TauchRoboter();


    public String waio() {
        return "Weil ich es so will";//das ist ein kommentar
    }

//das ist ein kommentar

    @Override
    public String toString() {
        return "Gugu{" +
                "zahl=" + zahl +
                ", name='" + name + '\'' +
                ", flyFly=" + flyFly +
                ", blubBlub=" + blubBlub +
                ", Anz Wochentag=" + DAYS_IN_WEEK +
                '}';
    }
}

/* This program occasionally deletes all files on

your hard drive and renders it unusable

forever when you click the Save button. */