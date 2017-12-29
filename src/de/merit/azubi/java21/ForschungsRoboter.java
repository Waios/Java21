package de.merit.azubi.java21;

public class ForschungsRoboter extends Roboter {

    float temperature;
    int speed;
    String farbe = "silber";



    public String toString() {
        return super.toString()+ "\nForschungsRoboter{" +
                "\ntemperature=" + temperature +
                ", \nspeed=" + speed +
                ", \nfarbe='" + farbe + '\'' +
                '}';
    }
}
