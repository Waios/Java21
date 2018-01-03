package de.merit.azubi.java21.day4;
import static org.junit.jupiter.api.Assertions.*;
public class IfTest {


    private String[] arguments = new String[3];

    @org.junit.jupiter.api.Test
    void ifExample() {
        String server;
        arguments[0] = "workstation";
        int duration;

        if (arguments.length < 1) {

            server = "localhost";

        } else {

            server = arguments[0];

        }

      assertEquals("workstation",server);


    }
    @org.junit.jupiter.api.Test
    void ifExample2() {
        int speed = 0;
        String status = null;
        float temperature = -90;

        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }

        assertEquals(5,speed);
        assertEquals("returning home",status);




        boolean outOfGas = true;

        if (outOfGas) {

            status = "inactive";

        }
        assertEquals("inactive",status);

    }

    @org.junit.jupiter.api.Test
    void ifExampleTernary() {

        String status = null;
        float temperature = -60;


            status = temperature < -80?"returning home":"driving";


        assertEquals("driving",status);





    }

}

