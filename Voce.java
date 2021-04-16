package artikal;

public class Voce extends Artikal{
    private String jedinicaMere;
    private double cenaPoJediniciMere;
    private String tip;

    public Voce(String jedinicaMere, double cenaPoJediniciMere, String tip, String naziv) {
        this.jedinicaMere = jedinicaMere;
        this.cenaPoJediniciMere = cenaPoJediniciMere;
        this.tip = tip;
        super.naziv = naziv;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    @Override
    public String toString() {
        return naziv +" - "+ tip + "[" + cenaPoJediniciMere+ "/" + jedinicaMere+"]";
    }

    @Override
    public double izracunajCenu(double kolicina) {
        return kolicina * cenaPoJediniciMere;
    }
}
