package main.controller;

import main.model.Bestellung;
import main.model.Buch;
import main.model.Konto;
import main.repository.BestellungRepo;
import main.repository.BuchRepo;
import main.repository.KontoRepo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BestellungController {

    private final BestellungRepo bestellungRepo;
    private final KontoRepo kontoRepo;
    private final BuchRepo buchRepo;

    public BestellungController(BestellungRepo bestellungRepo, KontoRepo kontoRepo, BuchRepo buchRepo) {
        this.buchRepo = buchRepo;
        this.kontoRepo = kontoRepo;
        this.bestellungRepo = bestellungRepo;
    }


    public boolean delete(String username) {

        for (Konto konto : kontoRepo.getAll()) {
            if (konto.getUsername().equals(username)) {
                kontoRepo.delete(username);
                return true;
            }
        }
        return false;
    }

    public void addBestellung(Konto konto, LocalDateTime datum, String idBestellung, float gesamtPreis, String adresse, List<Buch> chosenBooks) throws Exception {
        // Check if the account exists
        if (kontoRepo.getById(konto.getUsername())) {
            // Create a new order for the account

//                  datum;
//    private String idBestellung;
//    private float gesamtpreis;
//    private String adresse;

            // Add the chosen books to the order
            for (Buch buch : chosenBooks) {
                if (buchRepo.getById(buch.getIdBuch())) {
                    Bestellung bestellung = new Bestellung(datum, idBestellung, gesamtPreis, adresse, chosenBooks);
                    bestellungRepo.add(bestellung);
                } else {
                    throw new Exception("Error");
                }
            }
        }
    }
}
