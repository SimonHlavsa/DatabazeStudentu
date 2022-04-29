package com.DatabezeStudentu;

public class Predmet {
    private final String nazevPredmetu;
    private final int vyucujiciID;
    private final String vyucujiciCeleJmeno;
    private final int pocetKreditu;

    public Predmet(String nazevPredmetu, int vyucujiciID, String vyucujiciCeleJmeno, int pocetKreditu) {
        this.nazevPredmetu = nazevPredmetu;
        this.vyucujiciID = vyucujiciID;
        this.vyucujiciCeleJmeno = vyucujiciCeleJmeno;
        this.pocetKreditu = pocetKreditu;
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    public int getVyucujiciID() {
        return vyucujiciID;
    }

    @Override
    public String toString() {
        return "Předmět: " + nazevPredmetu + ",  ID vyučujícího: " + vyucujiciID + ",  Jméno vyučujícího: " + vyucujiciCeleJmeno + ",  Počet Kreditů: " + pocetKreditu;
    }
}
