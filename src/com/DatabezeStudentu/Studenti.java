package com.DatabezeStudentu;

public class Studenti extends Lide{
    private String program;

    public Studenti(int ID, String jmeno, String prijmeni, String fakulta, String pozice, String program) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
        this.program = program;
    }




}
