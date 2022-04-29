package com.DatabezeStudentu;

import java.util.LinkedList;

public class Fakulta implements IFakulta {

    private final String nazev;
    public LinkedList<Predmet> predmety = new LinkedList<>();

    public Fakulta(String nazev) {
        this.nazev = nazev;
    }
//  PŘIDÁNÍ PŘEDMĚTŮ (MŮŽE JEN ČLOVĚK Z DANÉ FAKULTY - ZATÍM KDOKOLIV)
    @Override
    public void pridatPredmet(String nazevPredmetu, int vyucujiciID, int pocetKreditu){
        for (Lide clovek : Skola.lide){
            if (clovek.getFakulta().getNazev().equals(nazev)){
                String celeJmeno = clovek.getJmeno() + clovek.getPrijmeni();
                predmety.add(new Predmet(nazevPredmetu, vyucujiciID, celeJmeno, pocetKreditu));
            }
        }
    }

//  SMAZAT PŘEDMĚT MŮŽE JEN UČITEL DANÉHO PŘEDMĚTU
    @Override
    public void smazatPredmet(String nazevPredmetu, int IDOsobyProvadejiciakci){
        for (Predmet predmet : predmety)
            if (IDOsobyProvadejiciakci == predmet.getVyucujiciID()){
                if (predmet.getNazevPredmetu().equals(nazevPredmetu))
                    predmety.remove(predmet);
            }
            else
                System.out.println("Nelze smazat, neplatné ID");
    }

    @Override
    public String toString() {
        return nazev;
    }

    public String getNazev() {
        return nazev;
    }
}
