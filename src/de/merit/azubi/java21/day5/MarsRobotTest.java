package de.merit.azubi.java21.day5;

import static org.junit.jupiter.api.Assertions.*;

class MarsRobotTest {

    @org.junit.jupiter.api.Test
    void initTest() {


        MarsRobot theRobot = new MarsRobot("exploring", 5, 200);
        assertNotNull(theRobot);


        assertEquals("exploring", theRobot.status);
        assertEquals(5, theRobot.speed);
        assertEquals(200, theRobot.power);
    }

    @org.junit.jupiter.api.Test
    void init2Test() {


        MarsRobot theRobot = new MarsRobot("exploring", 5);
        assertNotNull(theRobot);


        assertEquals("exploring", theRobot.status);
        assertEquals(5, theRobot.speed);
        assertEquals(300, theRobot.power);
    }

    @org.junit.jupiter.api.Test
    void init3Test() {


        MarsRobot theRobot = new MarsRobot("exploring");
        assertNotNull(theRobot);


        assertEquals("exploring", theRobot.status);
        assertEquals(20, theRobot.speed);
        assertEquals(500, theRobot.power);
    }
}