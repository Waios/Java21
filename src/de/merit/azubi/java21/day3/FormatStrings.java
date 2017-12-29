package de.merit.azubi.java21.day3;

import java.util.Locale;

public class FormatStrings {

    public static void main(String[] args) {
        int accountBalance = 5005;

        System.out.format("Balance: $%,d%n", accountBalance);
        System.out.format(Locale.GERMAN,"Balance: \u20AC%,d%n", accountBalance);
        double pi = Math.PI;
        System.out.format("%.11f%n", pi);

        /*
        Oracle’s Java site includes a beginner’s tutorial for printf-style output
        that describes some of the most useful formatting codes:
        http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
         */

        String label = "  From ";
        char result = label.trim().toUpperCase().replace('O', 'A').charAt(2);
        System.out.println(result);

        //Beispiel Klassenmethoden
        int firstPrice = 225;
        int secondPrice = 217;
        int higherPrice = Math.max(firstPrice, secondPrice);
        System.out.println(higherPrice);
    }
}
