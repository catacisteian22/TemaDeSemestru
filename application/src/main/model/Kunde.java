package main.model;

import java.util.Date;

public class Kunde  {
    private String name;
    private String vorname;
    private String email;
    private Date geburtsDatum;
    private String idKunde;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Date geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getIdKunde() {
        return idKunde;
    }

    public void setIdKunde(String idKunde) {
        this.idKunde = idKunde;
    }

}
