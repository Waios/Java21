package de.merit.azubi.java21.day6;

public abstract class Angestellter extends Person {

    private int gehalt;

    public Angestellter(String name, String vorname, int gehalt) {
        super(name, vorname);
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return super.toString()+ "Angestellter{" +
                "gehalt=" + gehalt +
                '}';
    }
}
