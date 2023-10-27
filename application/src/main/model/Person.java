package main.model;

import java.util.Date;

public class Person {

    private String name;
    private String vorname;
    private String cnp;
    private String email;
    private Date geburtsDatum;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", cnp=" + cnp +
                ", email='" + email + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                '}';
    }

    public Date getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Date geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
