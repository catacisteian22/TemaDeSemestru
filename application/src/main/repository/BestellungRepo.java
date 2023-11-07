package main.repository;

import main.model.Bestellung;

import java.util.List;
import java.util.Objects;

public class BestellungRepo implements InMemoryRepo<Bestellung> {

    List<Bestellung> bestellungList;

    public BestellungRepo(List<Bestellung> bestellungList) {

        this.bestellungList = bestellungList;
    }

    /**
     * @param b
     */
    public void add(Bestellung b){
        bestellungList.add(b);
    }

    public boolean getById(String id) {
        for (Bestellung bestellung : bestellungList) {
            if (Objects.equals(bestellung.getIdBestellung(), id)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) {
        bestellungList.removeIf(bestellung -> Objects.equals(bestellung.getIdBestellung(), id));

    }

    public Bestellung update(String id, Bestellung newBestellung) {
        for (int i = 0; i < bestellungList.size(); i++) {
            Bestellung bestellung = bestellungList.get(i);
            if (bestellung.getIdBestellung().equals(id)) {
                bestellungList.set(i, newBestellung);
                return newBestellung;
            }
        }
        return null;
    }

    public List<Bestellung> getAll() {
        return bestellungList;
    }
}