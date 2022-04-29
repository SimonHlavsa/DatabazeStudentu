package com.DatabezeStudentu;

import java.util.ArrayList;
import java.util.HashMap;

public class Skola {

    public static ArrayList<Lide> lide = new ArrayList<>();
    public static HashMap<Integer, String> mapaLidi = new HashMap<>();
    private static int IDOsoby = 0;

    //PRIDAVANI LIDI

    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, Fakulta fakulta, String program){
        lide.add(new Studenti(IDOsoby, jmeno, prijmeni, fakulta, pozice, program));
    }

    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, Fakulta fakulta) {
        if (pozice.equals("Učitel")) {
            lide.add(new Ucitele(IDOsoby, jmeno, prijmeni, fakulta, pozice));
        } else {
            lide.add(new Externiste(IDOsoby, jmeno, prijmeni, fakulta, pozice));
        }
    }
}
