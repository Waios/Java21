package de.merit.azubi.java21.day4;

public class WordToNumber {

    public long transform(String input) {

        switch (input){
            case"one":
                return 1L;

            case"two":
                return 2L;

            case"three":
                return 3L;

            case"four":
                return 4L;

            case"five":
                return 5L;

            case"six":
                return 6L;

            case"seven":
                return 7L;

            case"eight":
                return 8L;

            case"nine":
                return 9L;

            case"ten":
                return 10L;

            default:
                System.out.println("Invalid Number: "+ input);
        }
        return 0;
    }
}
