package main.model;

import main.discount.DiscountStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bestellung extends Wishlist{

    private LocalDateTime datum;
    private String idBestellung;
    private float gesamtpreis;
    private String adresse;
    private List<Buch> listeBucher;

    public Bestellung(LocalDateTime datum, String idBestellung, float gesamtpreis, String adresse, List<Buch> listeBucher) {
        this.datum = datum;
        this.idBestellung = idBestellung;
        this.gesamtpreis = gesamtpreis;
        this.adresse = adresse;
        this.listeBucher = listeBucher;
    }

    @Override
    public ArrayList<Buch> getListeBucher() {
        return (ArrayList<Buch>) listeBucher;
    }

    private DiscountStrategy discountStrategy;

    public Bestellung(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public float calculateGesamtpreis(float gesamtpreis) {
        return discountStrategy.applyDiscount(gesamtpreis);
    }
    public void setListeBucher(List<Buch> listeBucher) {
        this.listeBucher = listeBucher;
    }

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
