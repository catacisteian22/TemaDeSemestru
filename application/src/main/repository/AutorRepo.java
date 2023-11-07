package main.repository;

import main.model.Autor;

import java.util.List;
import java.util.Objects;

public class AutorRepo implements InMemoryRepo<Autor> {
    private static AutorRepo instance; // The single instance of AutorRepo

    private List<Autor> autorList;

    private AutorRepo(List<Autor> autorList) {
        this.autorList = autorList;
    }

    // Use a synchronized method to ensure thread safety during initialization
    public static synchronized AutorRepo getInstance(List<Autor> autorList) {
        if (instance == null) {
            instance = new AutorRepo(autorList);
        }
        return instance;
    }

    public void add(Autor b) {
        autorList.add(b);
    }

    public boolean getById(String id) {
        for (Autor autor : autorList) {
            if (Objects.equals(autor.getIdAutor(), id)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) {
        autorList.removeIf(autor -> Objects.equals(autor.getIdAutor(), id));
    }

    public Autor update(String id, Autor newAutor) {
        for (int i = 0; i < autorList.size(); i++) {
            Autor autor = autorList.get(i);
            if (Objects.equals(autor.getIdAutor(), id)) {
                autorList.set(i, newAutor);
                return newAutor;
            }
        }
        return null;
    }

    public List<Autor> getAll() {
        return autorList;
    }
}
