package main.repository;

import main.model.Buch;

import javax.print.DocFlavor;
import java.util.List;

public interface BuchRepo extends InMemoryRepo<Buch> {
    public Buch getByIdBuch(String idBuch);

}
