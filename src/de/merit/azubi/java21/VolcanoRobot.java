package de.merit.azubi.java21;

public class VolcanoRobot extends LandRoboter {


    public VolcanoRobot() {
        super();
    }

    public VolcanoRobot(String gugu) {
        super(gugu);
    }

    void checkTemperature() {
        if (temperature > 660) {

            status = "returning home";
            speed = 5;

        }
    }


    public String toString() {
        return super.toString();


    }
}
