package de.merit.azubi.java21.day3;

import java.util.StringTokenizer;

public class TokenTester {

    public static void main(String[] args) {
        StringTokenizer st1;
        StringTokenizer st2;
        StringTokenizer st3;
        StringTokenizer st4;

        String quote1 = "GOOG 530.80 -9.98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        System.out.println();
        String quote2 = "RHT@75.00@0.22";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());

        System.out.println();
        String quote3 = "VW,rot,100";
        st3 = new StringTokenizer(quote3, ",");
        System.out.println("Token 1: " + st3.nextToken());
        System.out.println("Token 2: " + st3.nextToken());
        System.out.println("Token 3: " + st3.nextToken());


        System.out.println();
        String birthday = "04/29/2016";
        st4 = new StringTokenizer(birthday, "/");
        System.out.println("Token 1: " + st4.nextToken());
        System.out.println("Token 2: " + st4.nextToken());
        System.out.println("Token 3: " + st4.nextToken());



    }
}
