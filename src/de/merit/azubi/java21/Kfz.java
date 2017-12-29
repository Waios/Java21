package de.merit.azubi.java21;

public class Kfz implements Farbig {

    String farbe;
    int ps;

    public Kfz(String farbe, int ps) {
        this.farbe = farbe;
        this.ps = ps;
    }


    @Override
    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Kfz{" +
                "farbe='" + farbe + '\'' +
                ", ps=" + ps +
                '}';
    }
}
