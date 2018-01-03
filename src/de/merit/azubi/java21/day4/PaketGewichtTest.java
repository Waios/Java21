package de.merit.azubi.java21.day4;
import de.merit.azubi.java21.day3.Paket;

import static org.junit.jupiter.api.Assertions.*;
public class PaketGewichtTest {

    @org.junit.jupiter.api.Test
    void initTest() {

        PaketGewicht pg = new PaketGewicht();
        assertNotNull(pg);
    }

    @org.junit.jupiter.api.Test
    void einPaketTest() {
        Paket[] miniListe = new Paket[1];
        Paket einPaket = new Paket(5, 10, 2,2);
        miniListe[0] = einPaket;

        PaketGewicht pg = new PaketGewicht();
        int gesamtGewicht = pg.bestimmeGewicht(miniListe);
        assertEquals(10, gesamtGewicht);
    }

    @org.junit.jupiter.api.Test
    void zweiPaketeTest() {
        Paket[] miniListe = new Paket[2];
        miniListe[0] = new Paket(5, 10, 2,2);
        miniListe[1] = new Paket(5, 5, 2,2);

        PaketGewicht pg = new PaketGewicht();
        int gesamtGewicht = pg.bestimmeGewicht(miniListe);
        assertEquals(15, gesamtGewicht);
    }


    @org.junit.jupiter.api.Test
    void vielePaketeTest() {
        Paket[] miniListe = new Paket[7];
        miniListe[0] = new Paket(5, 10, 2,2);
        miniListe[1] = new Paket(5, 5, 2,2);
        miniListe[2] = new Paket(1, 20, 2,2);
        miniListe[3] = new Paket(2, 60, 2,2);
        miniListe[4] = new Paket(5, 8, 2,2);
        miniListe[5] = new Paket(5, 7, 2,2);
        miniListe[6] = new Paket(5, 5, 2,2);

        PaketGewicht pg = new PaketGewicht();
        int gesamtGewicht = pg.bestimmeGewicht(miniListe);
        assertEquals(115, gesamtGewicht);
    }


    @org.junit.jupiter.api.Test
    void laengePaketTest() {
        Paket[] laengeListe = new Paket[2];
        laengeListe[0] = new Paket(151, 10,10,10);
        laengeListe[1] = new Paket(120, 10,10,10);
        PaketGewicht pg = new PaketGewicht();
        int zulang = pg.bestimmeLaenge(laengeListe);
        assertEquals(1, zulang);


    }
}
