package main.model;

import main.controller.BuchController;
import main.model.Buch;
import main.repository.BuchRepo;

import java.util.List;

public class Buchhandlung {
    private static Buchhandlung instance;
    private String name;
    private List<Buch> inventory;

    // Private constructor to prevent direct instantiation
    private Buchhandlung(String name, BuchRepo buchRepo) {
        this.name = name;
        this.inventory = buchRepo.getAll();
    }

    public Buchhandlung(String name) {
        this.name = name;
    }

    public static synchronized Buchhandlung getInstance(String name) {
        if (instance == null) {
            instance = new Buchhandlung(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public List<Buch> getInventory() {
        return inventory;
    }

    public void addToInventory(Buch book) {
        inventory.add(book);
    }

}
