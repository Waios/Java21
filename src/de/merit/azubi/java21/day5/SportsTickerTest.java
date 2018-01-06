package de.merit.azubi.java21.day5;

import static org.junit.jupiter.api.Assertions.*;

class SportsTickerTest {

    @org.junit.jupiter.api.Test
    void initTest() {


        SportsTicker testObject = new SportsTicker();
        assertNotNull(testObject);

    }

    @org.junit.jupiter.api.Test
    void rangeTest() {


        SportsTicker testObject = new SportsTicker();
       int[] range = testObject.makeRange(4, 13);
       assertEquals(10, range.length);

    }

    @org.junit.jupiter.api.Test
    void printTest() {


        SportsTicker testObject = new SportsTicker();
        int[] range = testObject.makeRange(4, 13);
        testObject.printMe();

        Ticker theTicker = new Ticker();
        theTicker.printMe();

    }

}