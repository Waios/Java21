package de.merit.azubi.java21.day3;

import java.awt.*;

public class PointSetter {

    public static void main(String[] args) {
        Point location = new Point(4, 13);
        System.out.println("Starting location:");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

        System.out.println("\nMoving to (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

        String name = location.getClass().getName();
        System.out.println(name);

        Class clazz = location.getClass();
        System.out.println(clazz);

        name = location.getClass().getSimpleName();
        System.out.println(name);
    }
}
