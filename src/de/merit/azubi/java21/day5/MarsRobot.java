package de.merit.azubi.java21.day5;

public class MarsRobot {

    String status;
    int speed;
    int power;

    public MarsRobot(String in1, int in2, int in3) {
        status = in1;
        speed = in2;
        power = in3;
    }

    public MarsRobot(String in1, int in2) {
        this(in1, in2, 300);

    }

    public MarsRobot(String in1) {
        this(in1, 20, 500);
    }
}
