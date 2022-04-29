package com.DatabezeStudentu;

public class Studenti extends Lide{
    private String program;

    public Studenti(int ID, String jmeno, String prijmeni, Fakulta fakulta, String pozice, String program) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
        this.program = program;
    }


    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice + " " + program;
    }


}
