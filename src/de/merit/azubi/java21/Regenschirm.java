package de.merit.azubi.java21;

public class Regenschirm implements Farbig{

    String farbe;
    int anzahlSpeichen;

    public Regenschirm(String f, int as) {
        this.farbe = f;
        this.anzahlSpeichen = as;
    }

    @Override
    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Regenschirm{" +
                "farbe='" + farbe + '\'' +
                ", anzahlSpeichen=" + anzahlSpeichen +
                '}';
    }
}
