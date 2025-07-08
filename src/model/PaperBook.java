package model;

import service.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Sorry Not enough stock for PaperBook: "+title);
        }
        stock -= quantity;
        double total = price * quantity;
        System.out.println("Shipping " + quantity + " copy(ies) of " + title + " to " + address);
        ShippingService.send(address);
        return total;
    }
}
