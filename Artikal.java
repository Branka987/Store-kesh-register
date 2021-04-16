package artikal;

public abstract class Artikal {
    protected String naziv;

    public String getNaziv() {
        return naziv;
    }
    public abstract double izracunajCenu(double kolicina);

    }

