package de.merit.azubi.java21.day5;

public class Ticker {
    static int SUM;

    static final int MAX_OBJECTS = 10;
    private String vorname;
    private String nachname;
    static String wert;


    public Ticker(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Ticker() {

    }

    public String getName() {
        return vorname + " " + nachname;
    }

    public void setName(String vorname, String nn) {
        this.vorname = vorname;
        nachname = nn;
    }

    public int[] makeRange(int lower, int upper) {

        int[] range = new int[(upper - lower) + 1];

        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }

        return range;


    }

    public void printMe() {

        System.out.println("I am an instance of the class " + this.getClass().getName());
    }




}
