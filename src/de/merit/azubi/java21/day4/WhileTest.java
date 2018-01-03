package de.merit.azubi.java21.day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileTest {


    private String[] arguments = new String[3];

    @org.junit.jupiter.api.Test
    void whileExample() {
        int i = 1;
        int x = 2;

        while (i <= 4) {

            x = x * i++; // the body of the loop

        }
        assertEquals(48, x);


    }

    @org.junit.jupiter.api.Test
    void arrayCopierExample() {


        int[] array1 = {7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float[array1.length];

        System.out.print("array1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");

        System.out.print("array2: [ ");
        int count = 0;
        while (count < array1.length && array1[count] != 1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.println("]");
    }

    @org.junit.jupiter.api.Test
    void doWhileExample() {


        long i = 1;

        do {

            i *= 2;

            System.out.println(i + " ");

        } while (i < 3_000_000_000_000L);


    }

    @org.junit.jupiter.api.Test
    void loopBreakExample() {

        int[] array1 = {7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float[array1.length];


        int count = 0;
        while (count < array1.length) {
            if (array1[count] == 1) {
                break;
            }
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
    }

    @org.junit.jupiter.api.Test
    void loopContinueExample() {

        int[] array1 = {7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float[array1.length];


        int count = 0;
        while (count < array1.length) {
            if (array1[count] == 1) {
                count++;
                continue;
            }
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
    }

    @org.junit.jupiter.api.Test
    void labelExample() {

     out:for (int i = 0; i < 20; i++) {
            for (int j = 0; j <= 50; j++) {
                System.out.println(i * j);
                if (i * j > 400) {
                    break out;
                }
            }

        }

    }
}