package com.DatabezeStudentu;

import java.util.ArrayList;

public class Fakulta implements IFakulta {
    private final String nazev;
    public static ArrayList<Predmet> predmety = new ArrayList<>();

    public Fakulta(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }

    @Override
    public String toString() {
        return nazev;
    }
}
