public class Book {
    String author, title, publisher;
    double price;

    Book(String author, String title, double price, String publisher) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    void display() {
        System.out.println("Title: " + title + " | Author: " + author +
            " | Price: " + price + " | Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Balagurusamy", "Java Programming",      450, "McGraw Hill"),
            new Book("Kathy Sierra", "Head First Java",       599, "O'Reilly"),
            new Book("Robert Martin","Clean Code",            650, "Prentice Hall"),
            new Book("Thomas Cormen","Introduction to Algos",1200, "MIT Press")
        };

        System.out.println("All Books:");
        Book highest = books[0];
        for (Book b : books) {
            b.display();
            if (b.price > highest.price)
                highest = b;
        }

        System.out.println("\nBook with Highest Price:");
        highest.display();
    }
}