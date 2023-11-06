import main.controller.BestellungController;
import main.controller.BuchController;
import main.controller.KontoController;
import main.model.Bestellung;
import main.model.Buch;
import main.model.BuchFactory.*;
import main.model.Buchhandlung;
import main.model.Konto;
import main.repository.BestellungRepo;
import main.repository.BuchRepo;
import main.repository.KontoRepo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BuchhandlungApp {
    public static void main(String[] args) {
        Buchhandlung bookstore = Buchhandlung.getInstance("La Catalina si Elena ");
        System.out.println("Bookstore name: " + bookstore.getName());

        RomanceBuchFactory romanceBuchFactory = new RomanceBuchFactory();
        ActionBuchFactory actionBuchFactory = new ActionBuchFactory();
        BiologieBuchFactory biologieBuchFactory = new BiologieBuchFactory();
        MysteryBuchFactory mysteryBuchFactory = new MysteryBuchFactory();
        ThrillerBuchFactory thrillerBuchFactory = new ThrillerBuchFactory();
        YABuchFactory yaBuchFactory = new YABuchFactory();
        ChemieBuchFactory chemieBuchFactory = new ChemieBuchFactory();
        MathematikBuchFactory mathematikBuchFactory = new MathematikBuchFactory();
        PhysikBuchFactory physikBuchFactory = new PhysikBuchFactory();
        PsychologieBuchFactory psychologieBuchFactory = new PsychologieBuchFactory();

        Buch b6 = romanceBuchFactory.createBuch("1b", "Pride and Prejudice", "Jane Austen", 212, 1889, 12);

//        Buch b1 = new Buch("1b", "Pride and Prejudice", "Jane Austen", "Classic", 320, 1920, 34);
//        Buch b2 = new Buch("2b", "Jane Eyre", "Charlotte Bronte", "Classic", 320, 1920, 34);
//        Buch b3 = new Buch("3b", "Doamna Bovary", "Gustave Flaubert", "Classic", 320, 1920, 34);
//        Buch b4 = new Buch("4b", "Acolo unde canta racii", "Delia Owens", "Action", 320, 1920, 34);
//        Buch b5 = new Buch("5b", "Istoria secreta", "Donna Tartt", "Mystery", 320, 1920, 34);
        Konto konto1 = new Konto("us1", "1234", LocalDateTime.now(), "Kunde");
        Konto konto2 = new Konto("us2", "1234", LocalDateTime.now(), "Kunde");
        List<Konto> kontoList = new ArrayList<>();
        List<Buch> buchList = new ArrayList<>();
        buchList.add(b1);
        buchList.add(b2);
        buchList.add(b3);
        buchList.add(b4);
        buchList.add(b5);

        kontoList.add(konto1);
        kontoList.add(konto2);

        List<Buch> chosenBooks = new ArrayList<>();
        chosenBooks.add(b1);
        chosenBooks.add(b2);

        Bestellung bestellung1 = new Bestellung(LocalDateTime.now(), "1", 179, "Unirii", chosenBooks);
        List<Bestellung> bestellungList = new ArrayList<>();
        bestellungList.add(bestellung1);

        BuchRepo buchRepo = new BuchRepo(buchList); // Annahme: BuchRepo ist bereits implementiert
        KontoRepo kontoRepo = new KontoRepo(kontoList); // Annahme: KontoRepo ist bereits implementiert
        BestellungRepo bestellungRepo = new BestellungRepo(bestellungList); // Annahme: BestellungRepo ist bereits implementiert

        BuchController buchController = new BuchController(buchRepo);
        KontoController kontoController = new KontoController(kontoRepo);
        BestellungController bestellungController = new BestellungController(bestellungRepo, kontoRepo, buchRepo);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Buch anzeigen");
            System.out.println("2. Wollen einzuloggen?");
            System.out.println("3. Alle Kontos anschauen:");
            System.out.println("4. Eine Bestellung aufgeben:");
            System.out.println("0. Beenden");
            System.out.print("Wähle eine Option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Buch book : buchController.getAll()) {
                        System.out.println(book.toString());
                    }
                    break;
                case 2:
                    System.out.println("Enter username:");
                    String username = scanner.next();

                    Konto loggedInAccount = kontoController.getByUsername(username);

                    if (loggedInAccount != null) {
                        System.out.println("Login successful!");

                        // Display options for updating account information
                        System.out.println("Update Options:");
                        System.out.println("1. Update username");
                        System.out.println("2. Update password");
                        System.out.println("0. Return to main menu");
                        System.out.print("Choose an option: ");

                        int updateOption = scanner.nextInt();

                        switch (updateOption) {
                            case 1:
                                System.out.println("Enter new username:");
                                String newUsername = scanner.next();
                                loggedInAccount.setUsername(newUsername);
                                break;
                            case 2:
                                System.out.println("Enter new password:");
                                String newPassword = scanner.next();
                                loggedInAccount.setPassword(newPassword);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                                break;
                        }

                        // Update the account
                        boolean updateSuccessful = kontoController.update(loggedInAccount.getUsername(), loggedInAccount.getPassword(),loggedInAccount.getJoinDatum(), loggedInAccount.getTyp());
                        if (updateSuccessful) {
                            System.out.println("Account updated successfully.");
                        } else {
                            System.out.println("Failed to update account.");
                        }
                    } else {
                        System.out.println("Invalid username or password. Please try again or sign up!");

                        System.out.println("Enter username:");
                        String newUsername = scanner.next();
                        System.out.println("Enter password:");
                        String password = scanner.next();
                        System.out.println("Enter account type:");
                        String accountType = scanner.next();

                        boolean accountAdded = kontoController.add(newUsername, password, LocalDateTime.now(), accountType);

                        if (accountAdded) {
                            System.out.println("Account added successfully.");
                        } else {
                            System.out.println("Failed to add account. Username already exists.");
                        }
                        break;

                    }
                    break;
                case 3:
                    for (Konto konto : kontoController.getAll()) {
                        System.out.println(konto.getUsername());
                    }
                    break;
                case 4:
                    System.out.println("Enter your username:");
                    String userBestellung = scanner.next();

                    Konto loggedInBestellung = kontoController.getByUsername(userBestellung);

                    if (loggedInBestellung != null) {
                        String orderId = generateRandomString(4);

                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                        System.out.println("Enter delivery address:");
                        String deliveryAddress = "";

                        try {
                            deliveryAddress = reader.readLine();
                        } catch (IOException e) {
                            System.out.println("Error reading input: " + e.getMessage());
                        }
//                        List<Buch> booksChosen = new ArrayList<>();
//                        for (Buch book : buchController.getAll()) {
//                            System.out.println("Do you want to order " + buchController.getAll(). + "? (yes/no)");
//                            String choice = scanner.next().toLowerCase();
//                            if (choice.equals("yes")) {
//                                booksChosen.add(book);
//                            }
//                        }

                        float totalPrice = bestellungController.calculateTotalPrice(chosenBooks);
                        System.out.println("Total price:"+ totalPrice);
                        try {
                            bestellungController.addBestellung(loggedInBestellung, LocalDateTime.now(), orderId, totalPrice, deliveryAddress, chosenBooks);
                            System.out.println("Order placed successfully.");
                        } catch (Exception e) {
                            System.out.println("Error placing order: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid username. Please try again.");
                    }
                    break;

                case 0:
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Versuche es erneut.");
            }
        } while (choice != 0);
    }

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }
}