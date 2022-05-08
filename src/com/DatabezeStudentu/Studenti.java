package com.DatabezeStudentu;

import java.util.ArrayList;
import java.util.HashMap;

public class Studenti extends Lide{
    public String titul;
    private ArrayList<Predmet> odstudovanePredmety = new ArrayList<>();
    private HashMap<String, Integer> hodnoceniPredmetu = new HashMap<>();

    public Studenti(int ID, String jmeno, String prijmeni, Fakulta fakulta, String pozice, String titul) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
        this.titul = titul;
    }
    public Studenti(String jmeno, String prijmeni, Fakulta fakulta, String pozice, String titul) {
        super(Lide.IDOsoby++, jmeno, prijmeni, fakulta, pozice);
        this.titul = titul;
    }

    public void pridatPredmet(Predmet predmet){
        odstudovanePredmety.add(predmet);
    }

    public void novaZnamka(String predmet, Integer znamka){
        hodnoceniPredmetu.put(predmet, znamka);
    }

    public void getZnamky(){
        float prumer = 0.0f;
        for (int i = 0; i < hodnoceniPredmetu.size(); i++){
            System.out.println(hodnoceniPredmetu.values());
        }
        for (float f : hodnoceniPredmetu.values()){
            prumer += f;
        }
        prumer = prumer / hodnoceniPredmetu.size();
    }

    @Override
    public String pripravitProUlozeni() {
        return ID + ";" + jmeno + ";" + prijmeni + ";" + fakulta + ";" + pozice + ";" + titul;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + " Jméno: " + jmeno + " " + prijmeni + " Fakulta: " + fakulta + " Pozice: " + pozice + " " + titul;
    }


}
