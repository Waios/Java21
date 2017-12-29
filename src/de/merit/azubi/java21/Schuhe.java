package de.merit.azubi.java21;

public class Schuhe implements Farbig {


    String farbe;
    int groesse;

    public Schuhe( String aFarbe, int aGroesse) {
        this.farbe = aFarbe;
        this.groesse = aGroesse;
    }

    @Override
    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Schuhe{" +
                "farbe='" + farbe + '\'' +
                ", groesse=" + groesse +
                '}';
    }
}
