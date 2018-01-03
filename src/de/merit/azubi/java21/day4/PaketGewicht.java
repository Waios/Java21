package de.merit.azubi.java21.day4;

import de.merit.azubi.java21.day3.Paket;

public class PaketGewicht {


    public int bestimmeGewicht(Paket[] pakets) {

        int summe = 0;

        for (int x = 0; x < pakets.length; x++) {
            Paket aPaket = pakets[x];
            summe = summe + aPaket.weight;
        }

        return summe;
    }

    public int bestimmeLaenge(Paket[] pakets) {
        int anz = 0;

        for (int x = 0; x < pakets.length; x++) {
            Paket aPaket = pakets[x];
            if (aPaket.width > 150) {
                anz = anz + 1;
            }

        }
        return anz;
    }
}
