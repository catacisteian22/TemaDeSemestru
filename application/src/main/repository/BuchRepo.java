package main.repository;

import main.model.Buch;

import java.util.List;

public class BuchRepo implements InMemoryRepo<Buch> {

    List<Buch> buchList;

    public BuchRepo(List<Buch> buchList) {

        this.buchList = buchList;
    }

    /**
     * @param b
     */
//    @Override
    public void add(Buch b) {
        buchList.add(b);
    }

    public boolean getById(String id) {
        for (Buch buch : buchList) {
            if (buch.getIdBuch() == id) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) {
        for (Buch buch : buchList) {
            if (buch.getIdBuch() == id) {
                buchList.remove(buch);
            }
        }

    }

    public Buch update(String id, Buch newBuch) {
        for (int i = 0; i < buchList.size(); i++) {
            Buch buch = buchList.get(i);
            if (buch.getIdBuch().equals(id)) {
                buchList.set(i, newBuch);
                return newBuch;
            }
        }
        return null;
    }

    public List<Buch> getAll() {
        return buchList;
    }
}
