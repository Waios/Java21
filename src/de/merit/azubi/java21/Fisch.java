package de.merit.azubi.java21;

public class Fisch implements Farbig {

    String farbe;
    int anzahlGraeten;

    public Fisch(String farbe, int anzahlGraeten) {
        this.farbe = farbe;
        this.anzahlGraeten = anzahlGraeten;
    }

    public String getFarbe(){
        return farbe;
    }

    public int getGraeten(){
        return anzahlGraeten;
    }

    @Override
    public String toString() {
        return "Fisch{" +
                "farbe='" + farbe + '\'' +
                ", anzahlGraeten=" + anzahlGraeten +
                '}';
    }
}
