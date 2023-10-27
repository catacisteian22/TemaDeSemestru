package main.model;

import java.util.Date;

public class Angestellte extends Person{
    private String idAngestellte;
    private String rolle;
    private int gehalt;

    @Override
    public String toString() {
        return "Angestellte{" +
                "idAngestellte=" + idAngestellte +
                ", rolle='" + rolle + '\'' +
                ", gehalt=" + gehalt +
                '}';
    }

    public String getIdAngestellte() {
        return idAngestellte;
    }

    public void setIdAngestellte(String idAngestellte) {
        this.idAngestellte = idAngestellte;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
}
