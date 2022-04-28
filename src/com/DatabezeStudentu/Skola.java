package com.DatabezeStudentu;

import java.util.ArrayList;
import java.util.HashMap;

public class Skola {

     public static ArrayList studenti = new ArrayList();
     public static ArrayList ucitele = new ArrayList();
     public static ArrayList externiste = new ArrayList();
     public static HashMap<Integer, String> mapaLidi = new HashMap<>();
    private static int IDCOUNT = 0;


//  PRIDANI OSOB
    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, String fakulta, String program){
        studenti.add(new Studenti(IDCOUNT, jmeno, prijmeni, fakulta, pozice, program));
        mapaLidi.put(IDCOUNT, "Student");
        IDCOUNT++;
    }

    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, String fakulta){
        if (pozice.equals("Učitel")){
            ucitele.add(new Ucitele(IDCOUNT, jmeno, prijmeni, fakulta, pozice));
            mapaLidi.put(IDCOUNT, "Učitel");
            IDCOUNT++;

        }
        else{
            externiste.add(new Externiste(IDCOUNT, jmeno, prijmeni, fakulta, pozice));
            mapaLidi.put(IDCOUNT, "Externista");
            IDCOUNT++;
        }
    }

}
