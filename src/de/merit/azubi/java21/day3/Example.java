package de.merit.azubi.java21.day3;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Example {

    public static void main(String[] args) throws MalformedURLException {
        URL address = new URL("http://www.java21days.com");
        System.out.println(address);

        Random seed = new Random(606843071);
        for(int x = 0; x <10; x++) {

            System.out.println(seed.nextInt());
        }
        System.out.println(seed);

        Point pt = new Point(0, 0);
        System.out.println(pt);
    }
}
