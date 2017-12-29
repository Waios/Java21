package de.merit.azubi.java21;

public class TauchRoboter extends ForschungsRoboter {

    int tiefe;

    void steigen(int meter){

        tiefe = tiefe + meter;
        status = "auftauchen";
    }

    void sinken(int meter){

        tiefe = tiefe - meter;
        status = "abtauchen";
    }
    public String toString(){
        return super.toString()+"Tiefe: " + tiefe;

    }

}
