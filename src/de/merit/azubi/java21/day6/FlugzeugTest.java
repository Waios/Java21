package de.merit.azubi.java21.day6;

import java.util.ArrayList;
import static java.lang.Math.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FlugzeugTest {

    @org.junit.jupiter.api.Test
    void initTest() {


        Pilot testPilot = new Pilot("Müller", "Hans", 10000, "Copilot");
        assertNotNull(testPilot);
        System.out.println(testPilot);
        Person testPerson = new Pilot("Müller", "Richie", 10000, "Pilot");
        System.out.println(testPerson);

        Angestellter testAngestellter = new Pilot("Meier", "Karl", 10000, "Pilot");
        System.out.println(testAngestellter);

        Person [] personen = new Person[3];
        personen[0] = testPilot;
        personen[1] = testPerson;
        personen[2] = testAngestellter;

        Pilot [] piloten = new Pilot[3];
        piloten[0] = testPilot;
        piloten[1] = new Pilot("Ruppert", "Hans", 10000, "Copilot");
        piloten[2] = new Pilot("Roelle", "Christiane", 10000, "Pilot");

        System.out.println(personen[1].getClass());
        System.out.println(personen[1]);

        Pilot thePilot =(Pilot)personen[1];

    }

    @org.junit.jupiter.api.Test
    void personenTest() {

        java.awt.Font font1 = new java.awt.Font("Futura",1,1);
        javafx.scene.text.Font font2 = new javafx.scene.text.Font("Gugu",2);

      ArrayList arrayList;
        System.out.println("PI: " + PI);
        System.out.println("E: " + E);



    }
}
