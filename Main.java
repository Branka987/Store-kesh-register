package com.company;

import artikal.Artikal;
import artikal.Kozmetika;
import artikal.Povrce;
import artikal.Voce;
import prodavnica.Prodavnica;
import prodavnica.Racun;
// ako se nesto iz mejna prosledjuje metodi u drugoj klasi onda stavljamo argumente
public class Main {

    public static void main(String[] args) {
        Artikal a1 = new Povrce("kg", 80, "krompir");
        Artikal a2 = new Povrce ("kg", 55,"kupus");

        Artikal a3 = new Voce("kg", 90, "sveze", "jabuka");
        Artikal a4 = new Voce("kg", 140, "sveze", "banana");
        Artikal a5 = new Voce("kg", 0.4, "suvo","grozdje");
        Artikal a6 = new Voce("kutija", 200, "smrznuto", "malina");

        Artikal a7 = new Kozmetika(75,"sapun Nivea");
        Artikal a8 = new Kozmetika(250,"vlazne maramice");

        // raucn
        Racun r1= new Racun();
        r1.dodajArtikal(a1,2);
        r1.dodajArtikal(a2,1);

        Racun r2 = new Racun();
        r2.dodajArtikal(a4, 2);
        r2.dodajArtikal(a6,1);
        r2.dodajArtikal(a7,1);

        Racun r3 = new Racun();
        r3.dodajArtikal(a3, 1);
        r3.dodajArtikal(a5,250);
        r3.dodajArtikal(a8,1);

        Racun r4 = new Racun();
        r4.dodajArtikal(a1,1);
        r4.dodajArtikal(a8,1);
        r4.dodajArtikal(a6,2);

        // prodavnica
        Prodavnica p = new Prodavnica("Maxi", "Obilicev venac 21");
        p.dodajRacun(r1);
        p.dodajRacun(r2);
        p.dodajRacun(r3);
        p.dodajRacun(r4);

        System.out.println(p);
    }
}
