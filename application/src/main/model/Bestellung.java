package main.model;

import java.time.LocalDateTime;

public class Bestellung extends Wishlist{

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getGesamtpreis() {
        return gesamtpreis;
    }

    public void setGesamtpreis(float gesamtpreis) {
        this.gesamtpreis = gesamtpreis;
    }

    public String getIdBestellung() {
        return idBestellung;
    }

    public void setIdBestellung(String idBestellung) {
        this.idBestellung = idBestellung;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

}
