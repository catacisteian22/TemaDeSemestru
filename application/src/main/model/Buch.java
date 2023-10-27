package main.model;

//@Entity
//@Table(name = "buch")
public class Buch {

    private String idBuch;
    private String typ;
    private String title;
    private String autor;
    private String genre;
    private int anzahlSeiten;
    private String coverTyp;
    private int erstellungsjahr;
    private float preis;

    @Override
    public String toString() {
        return "Buch{" +
                "idProdukt=" + idBuch +
                ", typ='" + typ + '\'' +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", genre='" + genre + '\'' +
                ", anzahlSeiten=" + anzahlSeiten +
                ", coverTyp='" + coverTyp + '\'' +
                ", erstellungsjahr=" + erstellungsjahr +
                ", preis=" + preis +
                '}';
    }

    public String getIdBuch() {
        return idBuch;
    }

    public void setIdBuch(String idBuch) {
        this.idBuch = idBuch;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public void setAnzahlSeiten(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getCoverTyp() {
        return coverTyp;
    }

    public void setCoverTyp(String coverTyp) {
        this.coverTyp = coverTyp;
    }

    public int getErstellungsjahr() {
        return erstellungsjahr;
    }

    public void setErstellungsjahr(int erstellungsjahr) {
        this.erstellungsjahr = erstellungsjahr;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
