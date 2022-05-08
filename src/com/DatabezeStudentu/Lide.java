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

    public static boolean jeSeznamLidiPrazdny(){
        return lide.size() == 0;
    }

    public static String smazatOsobu(int ID){
        String zprava = null;
        for (Lide osobaKOdstraneni : lide){
            if (osobaKOdstraneni.ID == ID){
                lide.removeIf(osoba -> osoba.equals(osobaKOdstraneni));
                ulozitOsoby();
                zprava =  "Osoba byla smazána";
                break;
            }
            else
                zprava =  "Osoba s daným ID neexistuje";
        }
        return zprava;
    }

//  PRIDÁVÁNÍ OSOB
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void pridatOsobu(Lide osoba){
        lide.add(osoba);
    }

    public static void ulozitOsoby() {
        try {
            FileWriter lideCSV = new FileWriter(pathLide);
            lideCSV.flush();
            for (Lide osoba : lide) {
                lideCSV = new FileWriter(pathLide, true);
                PrintWriter zapsat = new PrintWriter(lideCSV);
                zapsat.println(osoba.pripravitProUlozeni());
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
        System.out.println();
        System.out.println("Seznam lidí VŠE");
        for (Lide osoba : lide){
            System.out.println(osoba);
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public String pripravitProUlozeni(){
        return ID + ";" + jmeno + ";" + prijmeni + ";" + fakulta + ";" + pozice ;
    }

    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }

}