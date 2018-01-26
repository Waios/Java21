package de.merit.azubi.java21.day6;

import java.awt.*;

public class RedButton extends javax.swing.JButton {

    private boolean offline;

    /*nix*/ static final double WEEKS = 9.5; //ist im gleichen Paket zugreifgbar

    protected static final int MEANING_OF_LIFE = 42;


    public String name = "Alarm";

    Color thecolor = Color.black;

    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

}