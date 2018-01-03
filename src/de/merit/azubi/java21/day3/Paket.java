package de.merit.azubi.java21.day3;

public class Paket {

    static String zusteller = "dhl";

    int height;
   public int weight;
   public int width;
    int depth;

    public Paket(int wi,int we, int h, int d) {
        this.depth = d;
        this.height = h;
        this.weight = we;
        this.width = wi;

    }

    @Override
    public String toString() {
        return "Paket{" +
                "height=" + height +
                ", weight=" + weight +
                ", depth=" + depth +
                ", width=" + width +
                ", zusteller=" + zusteller +
                '}';
    }
}
