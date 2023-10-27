package main.repository;

import java.util.ArrayList;
import java.util.List;

public interface InMemoryRepo<E> {

    void add(E entity);
    void delete(String id);
    E update();
    public List<E> getAll();
    public E getById(int index) ;
}
