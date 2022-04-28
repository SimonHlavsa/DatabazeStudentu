package com.DatabezeStudentu;

public class Lide {

    private int ID;
    private String jmeno;
    private String prijmeni;
    private String fakulta;
    private String pozice;
    public Lide(int ID, String jmeno, String prijmeni , String fakulta, String pozice) {
        this.ID = ID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.fakulta = fakulta;
        this.pozice = pozice;

    }

    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }
}