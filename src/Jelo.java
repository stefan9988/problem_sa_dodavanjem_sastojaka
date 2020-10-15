

import java.util.ArrayList;

public class Jelo {
    private int id_jela;
    private String naziv_jela;
    private String opis_jela;
    private double cena_jela;
    private float rating_jela;
    private String slika_jela;
    private ArrayList<Sastojci>sastojciArrayList;

    public Jelo(int id_jela,String naziv_jela, String opis_jela, double cena_jela, float rating_jela, String slika_jela) {
        this.id_jela=id_jela;
        this.naziv_jela = naziv_jela;
        this.opis_jela = opis_jela;
        this.cena_jela = cena_jela;
        this.rating_jela = rating_jela;
        this.slika_jela = slika_jela;
        sastojciArrayList=new ArrayList<>();
    }

    public int getId_jela() {
        return id_jela;
    }

    public void setId_jela(int id_jela) {
        this.id_jela = id_jela;
    }

    public String getNaziv_jela() {
        return naziv_jela;
    }

    public void setNaziv_jela(String naziv_jela) {
        this.naziv_jela = naziv_jela;
    }

    public String getOpis_jela() {
        return opis_jela;
    }

    public void setOpis_jela(String opis_jela) {
        this.opis_jela = opis_jela;
    }

    public double getCena_jela() {
        return cena_jela;
    }

    public void setCena_jela(double cena_jela) {
        this.cena_jela = cena_jela;
    }

    public float getRating_jela() {
        return rating_jela;
    }

    public void setRating_jela(float rating_jela) {
        this.rating_jela = rating_jela;
    }

    public String getSlika_jela() {
        return slika_jela;
    }

    public void setSlika_jela(String slika_jela) {
        this.slika_jela = slika_jela;
    }

    public ArrayList<Sastojci> getSastojciArrayList() {
        return sastojciArrayList;
    }

    public void setSastojciArrayList(ArrayList<Sastojci> sastojciArrayList) {
        this.sastojciArrayList = sastojciArrayList;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id_jela=" + id_jela +
                ", naziv_jela='" + naziv_jela + '\'' +
                ", opis_jela='" + opis_jela + '\'' +
                ", cena_jela=" + cena_jela +
                ", rating_jela=" + rating_jela +
                ", slika_jela='" + slika_jela + '\'' +
                ", sastojciArrayList=" + sastojciArrayList +
                '}';
    }
}
