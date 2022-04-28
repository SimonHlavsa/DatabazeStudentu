package com.DatabezeStudentu;

public class Main {
    public static void main(String[] args) {

        /*
        prostě ve Škole by byly uloženy záznamy z kategorie ucitele, studenti, externiste zvlast.
        Byla by tam taky hashMapa, kde by byl v klíči Integer (ID) a ve value String (studenti, uciteke, externiste), to by pak sloužilo k vyhledávání
            -> zadáš ID, to v hashmape rozliší,o kterou kategorii se jedná a nasledně prohledá daný linkedList.
            (Ano, je to zbytečný krok protože u jmena to stejne budeme muset delat jinak, ale nvm, jak jinak to udelat, osoně bych to tam vubec nedaval)
            Ještě mě napadlo dát v hashMape napravo Integer a nalevo object, ale tam mi pak z toho nešli získávat hodnoty v těch objectech, jen printovat, ale možná to dělám jen špatně
        Jinak ještě jsem neřešil, jak tam budeme dávat předměty.
        Zatím takhle
         */


        Skola.pridatCloveka("Učitel", "tonda", "Novotný", "FIS");

        Skola.pridatCloveka("Student", "marek", "Novotný", "FIS", "bakalář");

        System.out.println(Skola.ucitele);
        System.out.println(Skola.studenti);

    }
}
