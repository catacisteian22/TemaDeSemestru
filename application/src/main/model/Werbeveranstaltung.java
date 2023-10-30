package main.model;

import java.time.LocalDateTime;

public class Werbeveranstaltung {
    private LocalDateTime dateWerbe;
    private String titelWerbe;
    //private int anzahl;


    public String getTitelWerbe() {
        return titelWerbe;
    }

    public void setTitelWerbe(String titelWerbe) {
        this.titelWerbe = titelWerbe;
    }

    public LocalDateTime getDateWerbe() {
        return dateWerbe;
    }

    public void setDateWerbe(LocalDateTime dateWerbe) {
        this.dateWerbe = dateWerbe;
    }


}
