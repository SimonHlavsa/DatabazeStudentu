package com.DatabezeStudentu;

public abstract class Lide {

    protected int ID;
    protected String jmeno;
    protected String prijmeni;
    protected Fakulta fakulta;
    protected String pozice;
    public Lide(int ID, String jmeno, String prijmeni , Fakulta fakulta, String pozice) {
        this.ID = ID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.fakulta = fakulta;
        this.pozice = pozice;

    }

    public void zmenitFakultu(Fakulta fakulta){
        this.fakulta = fakulta;
    }

    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }
}