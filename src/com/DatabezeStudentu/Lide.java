package com.DatabezeStudentu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

    private void pridatCloveka(Lide lide){
        try {
        FileWriter zapis = new FileWriter("databaze.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo pro jaký typ osoby chcete přidat");
        System.out.println("1 - Student\n2 - Učitel\n3 - Externista");
        Integer osoba = Integer.parseInt(sc.nextLine());
        String jmeno, prijmeni, pozice, program;
        Fakulta f = null;
        switch (osoba){
            case 1:
                int id = lide.ID++;
                System.out.println("Zadejte jméno studenta");
                jmeno = sc.nextLine();
                System.out.println("Zadejte příjmení studenta");
                prijmeni = sc.nextLine();
                System.out.println("Zadejte fakultu studenta");
                f = new Fakulta(sc.nextLine());
                System.out.println("Zadejte jestli je student na studiu:\nBakalářském - napište bakalar\nMagisterském - napiste" +
                        "- magistr\nDokorském - napište doktorant");
                pozice = sc.nextLine();
                System.out.println("Zadejte program studenta");
                program = sc.nextLine();
                Lide os = new Studenti(id,jmeno,prijmeni, fakulta, pozice, program);
                zapis.write(id + ";" + jmeno + ";" + prijmeni + ";" + f + ";" + pozice + ";" + program);
                zapis.close();
                break;

            case 2:
                id = lide.ID++;
                System.out.println("Zadejte jméno učitele");
                jmeno= sc.nextLine();
                System.out.println("Zadejte příjmení učitele");
                prijmeni = sc.nextLine();
                System.out.println("Zadejte fakultu učitele");
                f = new Fakulta(sc.nextLine());
                System.out.println("Zadejte pozici učitele");
                pozice = sc.nextLine();

                os = new Ucitele(id,jmeno,prijmeni, fakulta, pozice);
                zapis.write(id + ";" + jmeno + ";" + prijmeni + ";" + f + ";" + pozice);
                zapis.close();
                break;

            case 3:
                id = lide.ID++;
                System.out.println("Zadejte jméno externisty");
                jmeno= sc.nextLine();
                System.out.println("Zadejte příjmení externisty");
                prijmeni = sc.nextLine();
                System.out.println("Zadejte fakultu externisty");
                f = new Fakulta(sc.nextLine());
                System.out.println("Zadejte pozici externisty");
                pozice = sc.nextLine();

                os = new Externiste(id,jmeno,prijmeni, f, pozice);
                zapis.write(id + ";" + jmeno + ";" + prijmeni + ";" +  f + ";" + pozice);
                zapis.close();
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return ID + " " + jmeno + " " + prijmeni + " " + fakulta + " " + pozice ;
    }
}