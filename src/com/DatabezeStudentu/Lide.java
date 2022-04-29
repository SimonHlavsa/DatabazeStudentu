package com.DatabezeStudentu;

public class Lide {

    protected int ID;
    protected String jmeno;
    protected String prijmeni;
    protected Fakulta fakulta;
    protected String pozice; //Student, Ucitel, Externista (až se bude přidávat nová osoba, tak se dá dotyčnému vybrat jedna z těchto 3. možností, ať to je ez, kvůli preklepum, apod.
    public Lide(int ID, String jmeno, String prijmeni , Fakulta fakulta, String pozice) {
        this.ID = ID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.fakulta = fakulta;
        this.pozice = pozice;

    }

    public int getID() {
        return ID;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public Fakulta getFakulta() {
        return fakulta;
    }

    public String getPozice() {
        return pozice;
    }

    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }
}