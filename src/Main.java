import model.*;

public class Main {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();

        Book paper = new PaperBook("P1", "ya rab", "Aisha", 2004, 145.0, 10);
        Book paper2 = new PaperBook("P2", "what", "zaki-shan", 1990, 100, 4);
        Book ebook = new EBook("E1", "ya kareem", "Ibrahim", 2000, 130.0, "PDF");
        Book demo = new DemoBook("D1", "ya allah", "Ashour", 2010);

        inventory.addBook(paper);
        inventory.addBook(paper2);
        inventory.addBook(ebook);
        inventory.addBook(demo);

        System.out.println(" ");

        inventory.removeOutdatedBooks(30);

        System.out.println(" ");

        try {
            double paid = inventory.buyBook("P1", 2, "zakariya@gmail.com", "6 october city");
            System.out.println("Total paid: " + paid+" L.E.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" ");

        try {
            double paid = inventory.buyBook("E1", 1, "hahaha@hotmail.com", "NA");
            System.out.println("Total paid: " + paid+" L.E.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" ");

        try {
            inventory.buyBook("D1", 1, "batee5@nothing.com", "NA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}