package de.merit.azubi.java21.day3;

public class CastingExample {
    public static void main(String[] args) {
        int result = (int)(7.0 / 5);
        System.out.println(result);

        double result2 = (7.0F / 5);
        System.out.println(result2);

        Integer dataCount = new Integer(7801);
        System.out.println(dataCount);
        int newCount = dataCount.intValue();
        System.out.println(newCount);

        String pennsylvania = "65000";

        int penn = Integer.parseInt(pennsylvania);
        System.out.println(penn);
    }
}
