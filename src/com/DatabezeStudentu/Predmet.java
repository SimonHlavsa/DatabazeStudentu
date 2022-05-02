package com.DatabezeStudentu;

public class Predmet {
    private final String nazevPredmetu;
    private final int vyucujiciID;
    private final String jmeno;
    private final String prijmeni;
    private final int pocetKreditu;

    public Predmet(String nazevPredmetu, int vyucujiciID, String jmeno, String prijmeni, int pocetKreditu) {
        this.nazevPredmetu = nazevPredmetu;
        this.vyucujiciID = vyucujiciID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pocetKreditu = pocetKreditu;
    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    @Override
    public String toString() {
        return "Předmět: " + nazevPredmetu + ",  ID vyučujícího: " + vyucujiciID + ",  Jméno: " + jmeno + ", Příjmení: " + prijmeni + ",  Počet Kreditů: " + pocetKreditu;
    }
}
