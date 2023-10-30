package main.repository;

import main.model.Bestellung;
import main.model.Buch;

import java.util.List;

public class BestellungRepo implements InMemoryRepo<Bestellung> {

    List<Bestellung> bestellungList;

    public BestellungRepo(List<Bestellung> bestellungList) {

        this.bestellungList = bestellungList;
    }

    /**
     * @param b
     */
//    @Override
    public void add(Bestellung b){
        bestellungList.add(b);
    }

    //    @Override
    public Bestellung getById(String id) {
        for (Bestellung bestellung : bestellungList) {
            if (bestellung.getIdBestellung() == id) {
                return bestellung;
            }
        }
        return null;
    }

    public void delete(String id) {
        for (Bestellung bestellung : bestellungList) {
            if (bestellung.getIdBestellung() == id) {
                bestellungList.remove(bestellung);
            }
        }

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