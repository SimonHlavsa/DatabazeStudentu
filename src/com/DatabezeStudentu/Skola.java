package com.DatabezeStudentu;

import java.util.ArrayList;

public class Skola {


    public static Fakulta[] fakulty = new Fakulta[3];
    public static ArrayList<Lide> lide = new ArrayList<>();
  //  public static HashMap<Integer, String> mapaLidi = new HashMap<>();

    private static int IDOsoby = 0;

    //PRIDAVANI LIDI
    public static void pridatFakulty(){
        if (fakulty[0] == null){
            Fakulta FIS = new Fakulta("Fakulta informatiky a statistiky");
            Fakulta FMV = new Fakulta("Fakulta mezinárodních vztahů");
            Fakulta FMI = new Fakulta("Fakulta financí a účetnictví");
            fakulty[0] = FIS;
            fakulty[1] = FMV;
            fakulty[2] = FMI;
        }
    }


    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, Fakulta fakulta, String program){
        lide.add(new Studenti(IDOsoby, jmeno, prijmeni, fakulta, pozice, program));
    }

    public static void pridatCloveka(String pozice, String jmeno, String prijmeni, Fakulta fakulta) {
        if (pozice.equals("Učitel")) {
            lide.add(new Ucitele(IDOsoby, jmeno, prijmeni, fakulta, pozice));
        }
        else {
            lide.add(new Externiste(IDOsoby, jmeno, prijmeni, fakulta, pozice));
        }
    }
}
