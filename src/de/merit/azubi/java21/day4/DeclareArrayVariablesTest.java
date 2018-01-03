package de.merit.azubi.java21.day4;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class DeclareArrayVariablesTest {

    @org.junit.jupiter.api.Test
    void showLength() {

        DeclareArrayVariables testObjekt = new DeclareArrayVariables();
        assertNotNull(testObjekt);
        testObjekt.showLength();

    }

    @org.junit.jupiter.api.Test
    void usePoints() {

        DeclareArrayVariables testObjekt = new DeclareArrayVariables();
        Point[] markup = { new Point(1,5), new Point(3,3), new Point(2,3) };

        testObjekt.targets = markup;
        testObjekt.showLength();

    }
    @org.junit.jupiter.api.Test
    void usePlayers() {

        DeclareArrayVariables testObjekt = new DeclareArrayVariables();
        String[] players = { "Waios", "Michael", "Christiane", "Emily", "Lotti"};
        testObjekt.players = players;
        testObjekt.showLength();

    }
    @org.junit.jupiter.api.Test
    void usePlayersDirect() {
        DeclareArrayVariables testObjekt = new DeclareArrayVariables();
        testObjekt.players[0] = "Waios";
        testObjekt.players[1] = "Michael";
        testObjekt.players[10] = "Emily";
        testObjekt.showLength();
        System.out.println(testObjekt.players);


    }
}