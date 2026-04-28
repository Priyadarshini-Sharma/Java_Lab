public class Books {
    String author, title, publisher;
    double price;
    int stock;

    Books(String author, String title, double price, String publisher, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }

    void display() {
        System.out.println("Title: " + title + " | Author: " + author +
            " | Price: " + price + " | Publisher: " + publisher + " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Books[] books = {
            new Books("Balagurusamy",  "Java Programming",       450,  "McGraw Hill",   30),
            new Books("Kathy Sierra",  "Head First Java",        599,  "O'Reilly",      25),
            new Books("Herbert Schildt","Java: Complete Ref",    799,  "McGraw Hill",   20),
            new Books("Robert Martin", "Clean Code",             650,  "Prentice Hall", 15),
            new Books("Thomas Cormen", "Introduction to Algos", 1200,  "MIT Press",     10),
            new Books("Andrew Tanenbaum","OS: Design & Impl",    875,  "Prentice Hall", 12),
            new Books("Navathe",       "Database Systems",       720,  "Pearson",       18),
            new Books("Forouzan",      "Data Communications",    540,  "McGraw Hill",   22),
            new Books("Boyce",         "Discrete Mathematics",   480,  "Cengage",       28),
            new Books("Gamma et al.",  "Design Patterns",        950,  "Addison-Wesley",8)
        };

        System.out.println("All Books:");
        Books highest = books[0];
        for (Books b : books) {
            b.display();
            if (b.price > highest.price)
                highest = b;
        }

        System.out.println("\nBook with Highest Price:");
        highest.display();
    }
}
