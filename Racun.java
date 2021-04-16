package prodavnica;

import artikal.Artikal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Racun implements Comparable<Racun>{
    // jedinstveni generisani identifikator, a to je ispod
    private static int ID = 1;h
    // zatim obicno polje koje ce zapamtiti trenutnu vrednost zadatok broja
    private int id;
    private HashMap<Artikal, Integer> mapaArtikala;
    private int dan;
    private int mesec;
    private int godina;

    public Racun() {
        this.id = Racun.ID; // postavljamo promenljivi id na staticki, pa dodajemo staticki za 1, to je ispod
        Racun.ID++;
        this.mapaArtikala = new HashMap<>();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        dan = localDate.getDayOfMonth();
        mesec = localDate.getMonthValue();
        godina = localDate.getYear();
    }
    // dodavanje artikala
    public void dodajArtikal(Artikal artikal, int kolicina){
        mapaArtikala.put(artikal, kolicina);
    }

    public int getId() {
        return id;
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }
    public double ukupnaCena(){ // racunamo cenu svih artikla, pomocu mape
        double ukupno = 0; // pretpostavljamo da ne postoji nijedan artikal, zato stavljamo na 0
        for (Artikal artikal:mapaArtikala.keySet()){// kolicina nam je u vrednosti mape
            // int kolicina = mapaArtikala.get(artikli)
            //ukupno += arikal.izracunajCenu(kolicina);
            ukupno += artikal.izracunajCenu(mapaArtikala.get(artikal));// nad vrednoscu artikal pozovemo metodu izracunaj cenu za vrednost
        }
        return ukupno;
    }

      @Override
    public String toString() {
        String pomoc = "Racun broj "+ id + " (" + dan +"."+mesec +"." +godina+")\n";
        for (Artikal artikal:mapaArtikala.keySet()){
            int kolicina = mapaArtikala.get(artikal);
            pomoc += "- "+ artikal +"\t" + kolicina + "\t" + artikal.izracunajCenu(kolicina)+"\n";
        }
        pomoc += "Ukupna cena: " + this.ukupnaCena() + " dinara.";
        return pomoc;
    }

    @Override
    public int compareTo(Racun o) {
        // da li je trenutna cena manja od ovog objekta u kom se nalazimo
        if (this.ukupnaCena() < o.ukupnaCena()) {
            return -1;
        }
        else if (this.ukupnaCena() > o.ukupnaCena()){
            return  1;
        }
        else {
            return 0;
        }
    }
}
