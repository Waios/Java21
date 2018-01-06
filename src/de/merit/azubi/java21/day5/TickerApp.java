package de.merit.azubi.java21.day5;

public class TickerApp {

    public static void main(String[] args) {

        String theWert = SportsTicker.wert;
        SportsTicker theTicker = new SportsTicker();
        String theName = theTicker.getName();

        int count = Integer.parseInt(args[0]);
        System.out.println(count);


    }
}
