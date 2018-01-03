package de.merit.azubi.java21.day4;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SwitchTest {

    @org.junit.jupiter.api.Test
    void switchCharExample() {

        char grade = 'D';

        switch (grade) {

            case 'A':

                System.out.println("Great job!");

                break;

            case 'B':

                System.out.println("Good job!");

                break;

            case 'C':

                System.out.println("You can do better!");

                break;

            default:

                System.out.println("Consider cheating!");

        }


    }

    @org.junit.jupiter.api.Test
    void switchstringExample() {

        String command = "close";

        switch (command) {


            case "open":

                openFile();

                break;

            case "close":

                closeFile();

                break;

            default:

                System.out.println("Invalid command");

        }

    }

    private void closeFile() {
        System.out.println("closeFile");
    }

    private void openFile() {
        System.out.println("openFile");

    }

    @org.junit.jupiter.api.Test
    void switchIntExample() {

        //int x = 5;
        int x = 6;

        switch (x) {

            case 2:

            case 4:

            case 6:

            case 8:

                System.out.println("x is an even number");

                break;

            default:

                System.out.println("x is an odd number");

        }
    }
}