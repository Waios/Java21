package de.merit.azubi.java21;


import java.util.ArrayList;

public class FarbenZaehler {


    public static void main(String[] args) {

        String example = "Socrates asked, \"Wie viele Farben\u2122 gibt es?\"";
        System.out.println(example);

        Fisch goldfisch = new Fisch("Gold\u4711", 10);
        Fisch hering = new Fisch("Silber", 20);


        Kfz audi = new Kfz("Blau", 120);
        Kfz vw = new Kfz("grau", 129);

        Schuhe adidas = new Schuhe("schwarz", 42);
        Regenschirm knirps = new Regenschirm("bunt", 8);


        ArrayList<Farbig> list = new ArrayList();
        System.out.println(list.size());
        list.add(knirps);
        list.add(adidas);
        list.add(goldfisch);
        list.add(audi);
        list.add(hering);
        list.add(vw);
        System.out.println(list.size());


        for (Farbig aktuellesFarbiges : list) {

            System.out.println(aktuellesFarbiges.getFarbe());

        }
        System.out.println(list);



    }
}
