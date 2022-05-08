package com.DatabezeStudentu;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    private static int volba;

    public static void menu(){

        boolean input = false;
        do {
            System.out.println();
            System.out.println("1 - Přidat osobu");
            System.out.println("2 - Vypsat osoby");
            System.out.println("3 - Najít osobu");
            System.out.println("4 - Změnit fakultu");
            System.out.println("5 - Odstranit osobu");
            System.out.println("6 - Konec");
            if (scanner.hasNextInt()){
                volba = scanner.nextInt();
                if (volba >= 1 && volba <=6)
                    input = true;
                else
                    System.out.println("Zvolte možnost 1 - 6");
            }
            else
                System.out.println("Zvolte možnost 1 - 6");
            scanner.nextLine();
        } while (!input);

        switch (volba){
            case 1:
                pridatOsobu();
            case 2:
                vypsatOsoby();
            case 3:
                najitOsobu();
            case 4:
                zmenitFakultu();
            case 5:
                smazatOsobu();
            case 6:
                System.exit(0);


        }
    }

//  NAJÍT OSOBU
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void zmenitFakultu(){

        Fakulta novaFakulta = null;

        if (Lide.jeSeznamLidiPrazdny()){
            System.out.println("Zatím nebyla přidána žádná osoba");
            menu();
        }

        System.out.println("Zadejte ID osoby, pro kterou chcete změnit fakultu");
        System.out.println("Pro ukončení napišt 'konec'");


        if (scanner.hasNextInt()) {
            int ID = scanner.nextInt();
            scanner.nextLine();

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
                    novaFakulta = Skola.fakulty[0];
                    break;
                case 2:
                    novaFakulta = Skola.fakulty[1];
                    break;
                case 3:
                    novaFakulta = Skola.fakulty[2];
                    break;
            }


            if (Lide.zmenitFakultu(ID, novaFakulta))
                System.out.println("Fakulta byla změněna");
            else
                System.out.println("Osoba s ID " + ID + " neexistuje");
            menu();
        }

        String input = scanner.nextLine();
        if (input.equals("konec")){
            menu();
        }

        else{
            System.out.println("neplatný input");
            zmenitFakultu();
        }

    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


    //  NAJÍT OSOBU
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void najitOsobu(){
        System.out.println("Zadejte parametr, podle kterého chcete osobu najít:");
        String input = scanner.nextLine().toLowerCase();
        if (Lide.najitOsobu(input)){
            System.out.println("Osoba byla nalezena");
        }
        else
            System.out.println("Osoba nebyla nalezena");
        menu();
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


    //  ODSTRANIT OSOBU
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void smazatOsobu(){
        if (Lide.jeSeznamLidiPrazdny()){
            System.out.println("Zatím nebyla přidána žádná osoba");
            menu();
        }

        System.out.println("Zadejte ID osoby, kterou chcete osdtranit:");
        System.out.println("Pro ukončení napišt 'konec'");


        if (scanner.hasNextInt()) {
            int ID = scanner.nextInt();
            scanner.nextLine();
            System.out.println(Lide.smazatOsobu(ID));
            menu();
        }

        String input = scanner.nextLine();
        if (input.equals("konec")){
            menu();
        }
        else{
            System.out.println("neplatný input");
            smazatOsobu();
        }

    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------



//  VYPSÁNÍ OSOB
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static void vypsatOsoby(){
        Lide.vypsatOsoby();
        menu();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


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
        Ucitele ucitel = new Ucitele(jmeno,prijmeni,fakulta,pozice);
        Lide.pridatOsobu(ucitel);
        menu();
    }

    private static void pridatExternistu(String jmeno, String prijmeni, Fakulta fakulta){
        String pozice = "Externista";
        Externiste externista = new Externiste(jmeno,prijmeni,fakulta,pozice);
        Lide.pridatOsobu(externista);
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

        Studenti student = new Studenti(jmeno,prijmeni,fakulta,pozice, titul);
        Lide.pridatOsobu(student);
        menu();
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
}

