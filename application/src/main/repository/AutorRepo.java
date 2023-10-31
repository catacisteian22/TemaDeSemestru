package main.repository;

import main.model.Autor;

import java.util.List;

public class AutorRepo implements InMemoryRepo<Autor> {

    List<Autor> AutorList;

    public AutorRepo(List<Autor> AutorList) {

        this.AutorList = AutorList;
    }

    //    @Override
    public void add(Autor b) {
        AutorList.add(b);
    }

    public boolean getById(String id) {
        for (Autor Autor : AutorList) {
            if (Autor.getIdAutor() == id) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) {
        for (Autor Autor : AutorList) {
            if (Autor.getIdAutor() == id) {
                AutorList.remove(Autor);
            }
        }

    }

    public Autor update(String id, Autor newAutor) {
        for (int i = 0; i < AutorList.size(); i++) {
            Autor Autor = AutorList.get(i);
            if (Autor.getIdAutor().equals(id)) {
                AutorList.set(i, newAutor);
                return newAutor;
            }
        }
        return null;
    }

    public List<Autor> getAll() {
        return AutorList;
    }
}
