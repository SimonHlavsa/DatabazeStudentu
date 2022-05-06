package com.DatabezeStudentu;

public class Skola {



    public static Fakulta[] fakulty = new Fakulta[3];
  //  public static HashMap<Integer, String> mapaLidi = new HashMap<>();


    public static void pridatFakulty(){
        if (fakulty[0] == null){
            Fakulta FIS = new Fakulta("FIS");
            Fakulta FMV = new Fakulta("FMV");
            Fakulta FMI = new Fakulta("FMI");
            fakulty[0] = FIS;
            fakulty[1] = FMV;
            fakulty[2] = FMI;
        }
    }

}
