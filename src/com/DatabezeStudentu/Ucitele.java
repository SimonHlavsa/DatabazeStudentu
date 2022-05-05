package com.DatabezeStudentu;

public class Ucitele extends Lide{
    public Ucitele(int ID, String jmeno, String prijmeni, Fakulta fakulta, String pozice) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
    }


    public void pridatPredmet(String nazevPredmetu, int pocetKreditu){
        Fakulta.predmety.add(new Predmet(nazevPredmetu, super.ID, super.jmeno, super.prijmeni, pocetKreditu ));
        System.out.println("předmět přidán");
    }

    public void smazatPredmet(String nazevPredmetu){
        for (Predmet predmet : Fakulta.predmety){
            if (predmet.getNazevPredmetu().equals(nazevPredmetu)){
                Fakulta.predmety.remove(predmet);
                System.out.println("předmět smazán");
            }
        }
    }
/*
    public void zadatZnamku(String predmet, int studentID, Integer znamka) {
        for (int i = 0; i < Skola.lide.size(); i++){
            if (Skola.lide.get(i).pozice.equals("Student")){
                if (Skola.lide.get(i).ID == studentID) {
                    System.out.println("známka přidána");
                } else
                    System.out.println("neplatné ID studenta");
            }
        }

    }

 */

}
