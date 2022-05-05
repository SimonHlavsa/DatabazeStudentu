package com.DatabezeStudentu;

import java.util.ArrayList;

public class Skola {



    public static Fakulta[] fakulty = new Fakulta[3];
  //  public static HashMap<Integer, String> mapaLidi = new HashMap<>();


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

}
