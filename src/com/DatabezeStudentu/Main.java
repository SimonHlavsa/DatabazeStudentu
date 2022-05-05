package com.DatabezeStudentu;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {

        Skola.pridatFakulty();

        Menu.menu();


//        for (int i = 0; i < 5; i++) {
//            Studenti student = new Studenti(i, "pavel", "novotny", Skola.fakulty[0], "Student", "bakalar");
//            Osoby.pridatOsobuDoZaznamu(student);
//        }
//
//
//        for (Osoby osoba : Osoby.osoby) {
//            if (osoba.ID == 3) {
//                Osoby.smazatOsobuZeZaznamu(osoba);
//                break;
//            }
//        }
//
//        for (Osoby osoba : Osoby.osoby){
//            System.out.println(osoba.toString());
//        }


    }


}
