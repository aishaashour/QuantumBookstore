package model;

import java.util.*;

public class BookInventory {
    private final Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("'"+book.title + "' Added to inventory.");
    }

    public void removeOutdatedBooks(int maxAge) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Book> removed = new ArrayList<>(); // list for deleted if yu want to return

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (currentYear - entry.getValue().getYear() > maxAge) {
                removed.add(entry.getValue());
                System.out.println("Removed outdated book '" + entry.getValue().title + "'.");
                iterator.remove();
            }
        }

    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        if (!inventory.containsKey(isbn)) {
            throw new IllegalArgumentException("Sorry Book with ISBN not found.");
        }
        return inventory.get(isbn).buy(quantity, email, address);
    }
}

