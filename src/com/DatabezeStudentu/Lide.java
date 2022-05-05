package com.DatabezeStudentu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class Lide {
    protected int ID;
    protected String jmeno, prijmeni, pozice;
    protected Fakulta fakulta;
    static ArrayList<Lide> lide = new ArrayList<>();

    public Lide(int ID, String jmeno, String prijmeni , Fakulta fakulta, String pozice) {
        this.ID = ID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.fakulta = fakulta;
        this.pozice = pozice;
    }

//    public static void smazatOsobuZeZaznamu(Osoby osobaKOdstraneni){
//        osoby.removeIf(osoba -> osoba.equals(osobaKOdstraneni));
//    }

    public static void pridatOsobuDoZaznamu(Ucitele ucitel) {
        lide.add(ucitel);
        try {
            FileWriter lideCSV = new FileWriter("lide.csv", true);
            PrintWriter zapsat = new PrintWriter(lideCSV);
            zapsat.println(ucitel.ID + ";" + ucitel.jmeno + ";" + ucitel.prijmeni + ";" + ucitel.fakulta + ";" + ucitel.pozice);
            zapsat.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void pridatOsobuDoZaznamu(Externiste externista) {
        lide.add(externista);
        try {
            FileWriter lideCSV = new FileWriter("lide.csv", true);
            PrintWriter zapsat = new PrintWriter(lideCSV);
            zapsat.println(externista.ID + ";" + externista.jmeno + ";" + externista.prijmeni + ";" + externista.fakulta + ";" + externista.pozice);
            zapsat.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void pridatOsobuDoZaznamu(Studenti student) {
        lide.add(student);
        try {
            FileWriter lideCSV = new FileWriter("lide.csv", true);
            PrintWriter zapsat = new PrintWriter(lideCSV);
            zapsat.println(student.ID + ";" + student.jmeno + ";" + student.prijmeni + ";" + student.fakulta + ";" + student.pozice + ";" + student.titul);
            zapsat.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }

}