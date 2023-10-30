package main.model;

import java.time.LocalDate;

public class Konto {

    private String username;
    private String password;
    private LocalDate joinDatum;
    private String typ;// kunde oder Angestellte

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public LocalDate getJoinDatum() {
        return joinDatum;
    }

    public void setJoinDatum(LocalDate joinDatum) {
        this.joinDatum = joinDatum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
