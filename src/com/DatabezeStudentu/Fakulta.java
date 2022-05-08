package com.DatabezeStudentu;

public class Fakulta implements IFakulta {
    private final String nazev;

    public Fakulta(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public String toString() {
        return nazev;
    }
}
