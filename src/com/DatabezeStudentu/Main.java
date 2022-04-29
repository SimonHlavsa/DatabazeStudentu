package com.DatabezeStudentu;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {


        // VŠECHNO CO JE V MAINU JE ZATÍM JEN NA ZKOUŠKU


        var FIS = new Fakulta("Fakulta informatiky a statistiky");
        var FMV = new Fakulta("Fakulta mezinárodních vztahů");
        var FMI = new Fakulta("Fakulta financí a účetnictví");

        Skola.pridatCloveka("Učitel", "tonda", "Novotný", FIS);
        Skola.pridatCloveka("Student", "marek", "Novotný", FMV, "bakalář");

        System.out.println(Skola.lide);


        FIS.pridatPredmet("dejepis", 0, 8);
        FIS.smazatPredmet("dejepis", 1);
        System.out.println(FIS.predmety.get(0));

    }
}
