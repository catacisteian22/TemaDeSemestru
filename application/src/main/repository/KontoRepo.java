package main.repository;

import main.model.Konto;
import java.util.List;

public class KontoRepo implements InMemoryRepo<Konto> {

   List<Konto> kontoList;

    public KontoRepo(List<Konto> kontoList) {

        this.kontoList = kontoList;
    }

    public void add(Konto k){
        kontoList.add(k);
    }

    public boolean getById(String username) {
        for (Konto Konto : kontoList) {
            if (Konto.getUsername() == username) {
                return true;
            }
        }
        return false;
    }

    public void delete(String username) {
        for (Konto Konto : kontoList) {
            if (Konto.getUsername() == username) {
                kontoList.remove(Konto);
            }
        }

    }

    public Konto update(String username, Konto newKonto) {
        for (int i = 0; i < kontoList.size(); i++) {
            Konto Konto = kontoList.get(i);
            if (Konto.getUsername().equals(username)) {
                kontoList.set(i, newKonto);
                return newKonto;
            }
        }
        return null;
    }

    public List<Konto> getAll() {
        return kontoList;
    }
}
