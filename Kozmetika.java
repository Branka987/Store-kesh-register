package artikal;

public class Kozmetika extends Artikal {
    private double cenaPoKomadu;

    public Kozmetika(double cenaPoKomadu, String naziv) {
        this.cenaPoKomadu = cenaPoKomadu;
        super.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv + "[" + cenaPoKomadu +"]";
    }

    @Override
    public double izracunajCenu(double kolicina) {
        return kolicina * cenaPoKomadu;
    }
}
