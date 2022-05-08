package com.DatabezeStudentu;

public class Studenti extends Lide{
    public String titul;

    public Studenti(int ID, String jmeno, String prijmeni, Fakulta fakulta, String pozice, String titul) {
        super(ID, jmeno, prijmeni, fakulta, pozice);
        this.titul = titul;
    }
    public Studenti(String jmeno, String prijmeni, Fakulta fakulta, String pozice, String titul) {
        super(Lide.IDOsoby++, jmeno, prijmeni, fakulta, pozice);
        this.titul = titul;
    }

    @Override
    public String pripravitProUlozeni() {
        return ID + ";" + jmeno + ";" + prijmeni + ";" + fakulta + ";" + pozice + ";" + titul;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + " Jméno: " + jmeno + " " + prijmeni + " Fakulta: " + fakulta + " Pozice: " + pozice + " " + titul;
    }


}
