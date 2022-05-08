package com.DatabezeStudentu;

public class Externiste extends Lide{
    public Externiste(int ID, String jmeno, String prijmeni , Fakulta fakulta, String pozice) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
    }

    public Externiste(String jmeno, String prijmeni , Fakulta fakulta, String pozice) {
        super(Lide.IDOsoby++, jmeno, prijmeni, fakulta, pozice);
    }

}
