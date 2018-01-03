package de.merit.azubi.java21.day4;

import java.awt.*;

public class DeclareArrayVariables {



    String[] requests = new String[0];

    Point[] targets = new Point[0];

    float[] donations = new float[0];

    String[] players = new String[11];

    Integer[] series = new Integer[3];

    public DeclareArrayVariables() {
        series[0] = new Integer(10);

        series[1] = new Integer(3);

        series[2] = new Integer(5);

        //series[3] = new Integer(7);

    }
    public void showLength() {
        System.out.println("requests" + requests.length);
        System.out.println("targets" + targets.length);
        System.out.println("players" + players.length);
        System.out.println("series" + series.length);
        System.out.println("donations" + donations.length);
    }





}
