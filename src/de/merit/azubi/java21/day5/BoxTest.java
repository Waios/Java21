package de.merit.azubi.java21.day5;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @org.junit.jupiter.api.Test
    void initTest() {


        Box theBox = new Box();
        assertNotNull(theBox);


        assertEquals(0, theBox.x1);
        assertEquals(0, theBox.x2);
        assertEquals(0, theBox.y1);
        assertEquals(0, theBox.y2);
    }

    @org.junit.jupiter.api.Test
    void coordinatesTest() {


        Box theBox = new Box();
        theBox.buildBox(25, 25, 50, 50);


        assertEquals(25, theBox.x1);
        assertEquals(50, theBox.x2);
        assertEquals(25, theBox.y1);
        assertEquals(50, theBox.y2);
    }

    @org.junit.jupiter.api.Test
    void pointsTest() {


        Box theBox = new Box();
        theBox.buildBox(new Point(10, 10), new Point(20, 20));


        assertEquals(10, theBox.x1);
        assertEquals(20, theBox.x2);
        assertEquals(10, theBox.y1);
        assertEquals(20, theBox.y2);
    }

    @org.junit.jupiter.api.Test
    void mixedTest() {


        Box theBox = new Box();
        theBox.buildBox(new Point(10, 10), 50, 50);


        assertEquals(10, theBox.x1);
        assertEquals(60, theBox.x2);
        assertEquals(10, theBox.y1);
        assertEquals(60, theBox.y2);
    }
}
