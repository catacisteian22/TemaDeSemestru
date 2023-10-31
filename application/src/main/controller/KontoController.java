package main.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import main.model.Konto;
import main.repository.KontoRepo;

public class KontoController {
    private final KontoRepo kontoRepo;

    public KontoController(KontoRepo kontoRepo) {
        this.kontoRepo = kontoRepo;
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

    public boolean add(String username, String password, LocalDateTime joinDatum, String typ) {

        Konto newKonto = new Konto(username, password, joinDatum, typ);
        for (Konto konto : kontoRepo.getAll()) {
            if (konto.getUsername().equals(username)) {
                return false;
            }
        }
        kontoRepo.add(newKonto);
        return true;
    }

    public boolean update(String username, String password, LocalDateTime joinDatum, String typ) {

        for (Konto konto : kontoRepo.getAll()) {
            if (konto.getUsername().equals(username)) {
                Konto newKonto = new Konto(username, password, joinDatum, typ);

                kontoRepo.update(konto.getUsername(), newKonto);
                return true;
            }
        }

        return false;
    }

    public Konto getByUsername(String username) {
        for (Konto b : kontoRepo.getAll()) {
            if (b.getUsername().equals(username))
                return b;
        }
        return null;
    }

    public KontoRepo getAll() {
        return kontoRepo;
    }
}
