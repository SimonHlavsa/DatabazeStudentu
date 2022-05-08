package com.DatabezeStudentu;

public class Ucitele extends Lide{
    public Ucitele(int ID, String jmeno, String prijmeni, Fakulta fakulta, String pozice) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
    }

    public Ucitele(String jmeno, String prijmeni, Fakulta fakulta, String pozice) {
        super(Lide.IDOsoby++, jmeno, prijmeni, fakulta, pozice);
    }

}
