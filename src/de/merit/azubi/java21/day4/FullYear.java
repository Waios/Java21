package de.merit.azubi.java21.day4;

public class FullYear {

    public static void main(String[] args) {


        int yearIn = 2016;
        if (args.length > 0) {
            yearIn = Integer.parseInt(args[0]);
        }
        System.out.println("Alle Tage des Jahres: " +yearIn);
        for(int m = 1; m <=12; m++) {

            int daysInMonth = DayCounter.countDays(m,yearIn);

            for (int d = 1; d <= daysInMonth; d++) {
                System.out.println(d+" "+m);
            }
        }

    }
}
