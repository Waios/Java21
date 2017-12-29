package de.merit.azubi.java21;

public class FlugRoboter extends ForschungsRoboter {

    long höhe;

    void steigen(int meter){

        höhe = höhe + meter;
        status = "steigt";
    }

    void sinken(int meter){

        höhe = höhe - meter;
        status = "sinkt";
    }


    public String toString() {
        return super.toString()+ "\nFlugRoboter{" +
                "\nhöhe=" + höhe +
                '}';
    }
}
