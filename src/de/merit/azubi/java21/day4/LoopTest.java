package de.merit.azubi.java21.day4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoopTest {
    @org.junit.jupiter.api.Test
    void forExample() {

        String[] salutation = new String[10];
        int i; // the loop index variable


        for (i = 0; i < salutation.length; i++)

        {
            salutation[i] = "Mr.";

        }
        assertEquals("Mr.", salutation[0]);
        assertEquals("Mr.", salutation[9]);
    }

}
