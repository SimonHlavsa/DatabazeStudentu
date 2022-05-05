
package com.DatabezeStudentu;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    private static int IDOsoby = 1;
    private static int volba;

    public static void menu(){

        System.out.println("1 - Přidat osobu");

        System.out.println("Vyberte možnost: ");

        volba = scanner.nextInt();
        scanner.nextLine();

        switch (volba){
            case 1:
                pridatOsobu();
        }
    }

//   PŘIDÁVÁNÍ OSOB
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void pridatOsobu() {
        String jmeno;
        String prijmeni;
        Fakulta fakulta = null;

        System.out.println("Zadejte křestní jméno:");
        jmeno = scanner.nextLine();

        System.out.println("Zadejte příjmení:");
        prijmeni = scanner.nextLine();

        boolean input = false;
        do {
            System.out.println("Na jakou fakultu chcete osobu přidat?");
            System.out.println("    1 - FIS");
            System.out.println("    2 - FMV");
            System.out.println("    3 - FMI");
            if (scanner.hasNextInt()){
                volba = scanner.nextInt();
                if (volba >= 1 && volba <=3)
                    input = true;
                else
                    System.out.println("Zvolte možnost 1 - 3");
            }
            else
                System.out.println("Zvolte možnost 1 - 3");
            scanner.nextLine();
        } while (!input);


        switch (volba){
            case 1:
                fakulta = Skola.fakulty[0];
                break;
            case 2:
                fakulta = Skola.fakulty[1];
                break;
            case 3:
                fakulta = Skola.fakulty[2];
                break;
        }

        input = false;
        do {
            System.out.println("O jakou osobu se bude jednat_");
            System.out.println("    1 - Učitel");
            System.out.println("    2 - Externista");
            System.out.println("    3 - Student");
            if (scanner.hasNextInt()){
                volba = scanner.nextInt();
                if (volba >= 1 && volba <=3)
                    input = true;
                else
                    System.out.println("Zvolte možnost 1 - 3");
            }
            else
                System.out.println("Zvolte možnost 1 - 3");
            scanner.nextLine();
        } while (!input);


        switch (volba){
            case 1:
                pridatUcitele(jmeno, prijmeni, fakulta);
                break;
            case 2:
                pridatExternistu(jmeno, prijmeni, fakulta);
                break;
            case 3:
                pridatStudenta(jmeno, prijmeni, fakulta);
                break;
        }
    }

    private static void pridatUcitele(String jmeno, String prijmeni, Fakulta fakulta){
        String pozice = "Učitel";
        Ucitele ucitel = new Ucitele(IDOsoby++,jmeno,prijmeni,fakulta,pozice);
        Lide.pridatOsobuDoZaznamu(ucitel);
        menu();
    }

    private static void pridatExternistu(String jmeno, String prijmeni, Fakulta fakulta){
        String pozice = "Externista";
        Externiste externista = new Externiste(IDOsoby++,jmeno,prijmeni,fakulta,pozice);
        Lide.pridatOsobuDoZaznamu(externista);
        menu();
    }

    private static void pridatStudenta(String jmeno, String prijmeni, Fakulta fakulta){
        String pozice = "Student";
        String titul = "";
        boolean input = false;
        do {
            System.out.println("Jaký titul součastně studuje?");
            System.out.println("    1 - Bakalář");
            System.out.println("    2 - Magistr");
            System.out.println("    3 - Doktorant");
            if (scanner.hasNextInt()){
                volba = scanner.nextInt();
                if (volba >= 1 && volba <=3)
                    input = true;
                else
                    System.out.println("Zvolte možnost 1 - 3");
            }
            else
                System.out.println("Zvolte možnost 1 - 3");
            scanner.nextLine();
        } while (!input);


        switch (volba){
            case 1:
                titul = "Bakalář";
                break;
            case 2:
                titul = "Magistr";
                break;
            case 3:
                titul = "Doktorant";
                break;
        }

        Studenti student = new Studenti(IDOsoby++,jmeno,prijmeni,fakulta,pozice, titul);
        Lide.pridatOsobuDoZaznamu(student);
        menu();
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
