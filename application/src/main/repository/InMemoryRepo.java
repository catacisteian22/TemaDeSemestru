package main.repository;

import java.util.ArrayList;
import java.util.List;

public interface InMemoryRepo<E> {

    void add(E entity);
    void delete(String id);
    E update(String id, E new_entity);
    public List<E> getAll();
    public E getById(String index) ;
}
