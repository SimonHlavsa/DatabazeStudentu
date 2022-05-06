package com.DatabezeStudentu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public abstract class Lide {
    protected int ID;
    protected String jmeno, prijmeni, pozice;
    protected Fakulta fakulta;
    static ArrayList<Lide> lide = new ArrayList<>();
    static String pathLide = "lide.csv";

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

//  PRIDÁVÁNÍ OSOB
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void pridatOsobu(Lide osoba){
        lide.add(osoba);
        vypsatOsoby();
    }

    public static void ulozitOsoby() {
        try {
            FileWriter lideCSV = new FileWriter(pathLide);
            lideCSV.flush();
            for (Lide osoba : lide){
                lideCSV = new FileWriter(pathLide, true);
                PrintWriter zapsat = new PrintWriter(lideCSV);
                zapsat.println(osoba.ID + ";" + osoba.jmeno + ";" + osoba.prijmeni + ";" + osoba.fakulta + ";" + osoba.pozice);
                zapsat.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void nactiOsoby(){
            lide.clear();
            try {
                for (String radek : Files.readAllLines(Path.of(pathLide))){
                    if (radek.equals("")){
                        break;
                    }
                    String[] rozdeleno = radek.split(";");
                    Fakulta nactiFakultu = null;
                    switch (rozdeleno[3]){
                        case "FIS":
                            nactiFakultu = Skola.fakulty[0];
                            break;
                        case "FMV":
                            nactiFakultu = Skola.fakulty[1];
                            break;
                        case "FMI":
                            nactiFakultu = Skola.fakulty[2];
                            break;
                    }
                    switch (rozdeleno[4]){
                        case "Učitel":
                            Ucitele ucitel = new Ucitele(Integer.parseInt(rozdeleno[0]),rozdeleno[1],rozdeleno[2], nactiFakultu,rozdeleno[4]);
                            lide.add(ucitel);
                            break;
                        case "Externista":
                            Externiste externista = new Externiste(Integer.parseInt(rozdeleno[0]),rozdeleno[1],rozdeleno[2], nactiFakultu,rozdeleno[4]);
                            lide.add(externista);
                            break;
                        case "Student":
                            Studenti student = new Studenti(Integer.parseInt(rozdeleno[0]),rozdeleno[1],rozdeleno[2], nactiFakultu,rozdeleno[4],rozdeleno[5]);
                            lide.add(student);
                            break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


//  VYPSÁNÍ OSOB
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void vypsatOsoby(){
        for (Lide osoba : lide){
            System.out.println(osoba);
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }

}