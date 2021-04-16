package prodavnica;

import java.util.ArrayList;
import java.util.Collections;

public class Prodavnica {
    private String naziv, adresa;
    private ArrayList<Racun> racuni;

    public Prodavnica(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.racuni = new ArrayList<>();
    }

    public void dodajRacun(Racun racun) {
        this.racuni.add(racun);
    }

    public Racun prviRacun(int dan, int mesec, int godine) {
        for (Racun racun : racuni) {
            if (racun.getDan() == dan && racun.getMesec() == mesec && racun.getGodina() == godine) {
                return racun;
            }
        }
            System.out.println("***** Ne postoji takava racun za trazeni datum. *****");
            return null;
    }
    public Racun najskupljiRacun(){
        // if (racun.size() == 0
        if (racuni.isEmpty()){          // da li postiji racun
            System.out.println(" *** Nema nijednog racuna u prodavnici. ***");
            return null;
        }
        return Collections.max(racuni);
    }
    public Racun najjeftinijiRacun(){
        if(racuni.isEmpty()){
            System.out.println("*** Nema nijednog racuna u prodavnici. ***");
            return null;
        }
        return Collections.min(racuni);
    }
    public double prosecnaVrednost(){
        if(racuni.isEmpty()){
            System.out.println("*** Nema nijednog racuna u prodavnici.");
            return 0;
        }
        double ukupno = 0;
        for (Racun racun: racuni){
            ukupno += racun.ukupnaCena();
        }
        return ukupno / racuni.size();
    }

    @Override
    public String toString() {
        String pomoc = "Prodavnica: " + naziv + ", " + adresa + "\n";
        pomoc += "------------------------------------------\n";
        pomoc += "Najskuplji racun: " + this.najskupljiRacun() + " \n";
        pomoc += "Njjeftiniji racun: " + this.najjeftinijiRacun() + " \n";
        pomoc += "Prosecna cena racuna: " + this.prosecnaVrednost() + " dinara.\n";
        pomoc += "----------------------------------------------------------------\n";
        for (Racun racun: racuni){
            pomoc += racun + "\n";
            pomoc += "-------------------------------------------------------------\n";
        }
        return pomoc;
    }
}
