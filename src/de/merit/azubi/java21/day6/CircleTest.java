package de.merit.azubi.java21.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void areaTest() {

        Circle theCircle = new Circle(30);
        System.out.println(theCircle.area());
    }


    @org.junit.jupiter.api.Test
    void circumferenceTest() {
        Circle theCircle = new Circle(10);
        System.out.println(theCircle.circumference());
    }
}