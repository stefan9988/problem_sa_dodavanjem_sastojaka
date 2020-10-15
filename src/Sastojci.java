

public class Sastojci {
    private int id_sastojka;
    private String naziv_sastojka;
    private int kolicina_sastojka;
    private Jelo jelo;

    public Sastojci(int id_sastojka,String naziv_sastojka, int kolicina_sastojka) {
        this.id_sastojka=id_sastojka;
        this.naziv_sastojka = naziv_sastojka;
        this.kolicina_sastojka = kolicina_sastojka;
    }

    public int getId_sastojka() {
        return id_sastojka;
    }

    public void setId_sastojka(int id_sastojka) {
        this.id_sastojka = id_sastojka;
    }

    public String getNaziv_sastojka() {
        return naziv_sastojka;
    }

    public void setNaziv_sastojka(String naziv_sastojka) {
        this.naziv_sastojka = naziv_sastojka;
    }

    public int getKolicina_sastojka() {
        return kolicina_sastojka;
    }

    public void setKolicina_sastojka(int kolicina_sastojka) {
        this.kolicina_sastojka = kolicina_sastojka;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    @Override
    public String toString() {
        return "Sastojci{" +
                "id_sastojka=" + id_sastojka +
                ", naziv_sastojka='" + naziv_sastojka + '\'' +
                ", kolicina_sastojka=" + kolicina_sastojka +
                ", jelo=" + jelo +
                '}';
    }
}

