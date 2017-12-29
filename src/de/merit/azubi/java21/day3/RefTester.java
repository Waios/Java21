package de.merit.azubi.java21.day3;

import java.awt.*;

public class RefTester {

    public static void main(String[] args) {
     Point pt1;
     Point pt2;
     pt1 = new Point(100, 100);


     pt2 = pt1;

     pt1.x = 200;
     pt2.y = 200;

        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);

        Point pt3 = new Point(100, 100);

        Point pt4 = new Point(100, 100);

        pt3.x = 400;
        pt3.y = 400;

        System.out.println("Point3: " + pt3.x + ", " + pt3.y);
        System.out.println("Point4: " + pt4.x + ", " + pt4.y);
    }
}
