package artikal;

public class Povrce extends Artikal {// Povrce je artikal znaci da nasledjuje artikal klasu
    private String jedinicaMere;
    private double cenaPoJediniciMere;

    public Povrce(String jedinicaMere, double cenaPoJediniciMere,String naziv) {
        this.jedinicaMere = jedinicaMere;
        this.cenaPoJediniciMere = cenaPoJediniciMere;
        super.naziv = naziv;
    }

    public String getJedinicaMere() { // moze se vratiti jedinica mere
        return jedinicaMere;
    }

    @Override
    public String toString() {
        return naziv + "[" + cenaPoJediniciMere +"/" + jedinicaMere +"]";
    }


    @Override
    public double izracunajCenu(double kolicina) {
        // return this.cenaPoJedinicMere * kolicina;
        return kolicina * cenaPoJediniciMere;
    }
}