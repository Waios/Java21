package de.merit.azubi.java21.day6;

public class Pilot extends Angestellter{


    private String rang;

    public Pilot(String name, String vorname, int gehalt, String rang) {
        super(name, vorname, gehalt);
        this.rang = rang;
    }

    @Override
    public String toString() {
        return super.toString()+"Pilot{" +
                "rang='" + rang + '\'' +
                '}';
    }
}
