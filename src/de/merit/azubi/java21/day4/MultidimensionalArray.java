package de.merit.azubi.java21.day4;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultidimensionalArray {

    //int x = 5;

    @org.junit.jupiter.api.Test
    void showLength() {

        int[][][] cen = new int[3][4][5];

        System.out.println("Elements in 1st dimension: " + cen.length);

        System.out.println("Elements in 2nd dimension: " + cen[0].length);

        System.out.println("Elements in 3rd dimension: " + cen[0][0].length);

        cen[1][2][2] = 23;
        System.out.println(cen[1][2][2]);
        System.out.println(cen[1][2][4]);


    }
    @org.junit.jupiter.api.Test
    void blockTest(){
        int x =10;
        { // start of block
            int y = 40;
            y = y + x;
            System.out.println(y);
        } // end of block

        System.out.println(x);


    }


}

