public class ProductSystem {

    abstract static class AbstractProduct {
        int productId;
        String name;
        String description;

        AbstractProduct(int productId, String name, String description) {
            this.productId   = productId;
            this.name        = name;
            this.description = description;
        }

        abstract void displayData();
    }

    static class Product extends AbstractProduct {
        double price;

        Product(int productId, String name, String description, double price) {
            super(productId, name, description);
            this.price = price;
        }

        @Override
        public void displayData() {
            System.out.println("Product ID  : " + productId);
            System.out.println("Name        : " + name);
            System.out.println("Description : " + description);
            System.out.println("Price       : Rs. " + price);
        }
    }

    static class Book extends Product {
        String isbn;
        String author;
        String title;

        Book(int productId, String name, String description, double price,
             String isbn, String author, String title) {
            super(productId, name, description, price);
            this.isbn   = isbn;
            this.author = author;
            this.title  = title;
        }

        @Override
        public void displayData() {
            super.displayData();
            System.out.println("ISBN        : " + isbn);
            System.out.println("Author      : " + author);
            System.out.println("Title       : " + title);
        }
    }

    static class TravelGuide extends Book {
        String country;

        TravelGuide(int productId, String name, String description, double price,
                    String isbn, String author, String title, String country) {
            super(productId, name, description, price, isbn, author, title);
            this.country = country;
        }

        @Override
        public void displayData() {
            System.out.println("===== TRAVEL GUIDE =====");
            super.displayData();
            System.out.println("Country     : " + country);
            System.out.println("========================");
        }
    }

    static class CompactDisc extends Product {
        String artist;
        String title;

        CompactDisc(int productId, String name, String description,
                    double price, String artist, String title) {
            super(productId, name, description, price);
            this.artist = artist;
            this.title  = title;
        }

        @Override
        public void displayData() {
            System.out.println("===== COMPACT DISC =====");
            super.displayData();
            System.out.println("Artist      : " + artist);
            System.out.println("Title       : " + title);
            System.out.println("========================");
        }
    }

    public static void main(String[] args) {
        TravelGuide tg = new TravelGuide(
            1001, "Travel Guide", "A guide to explore India",
            499, "ISBN-001", "Rahul Verma", "Explore India", "India"
        );

        CompactDisc cd = new CompactDisc(
            2001, "Music CD", "Bollywood Hits Collection",
            199, "A.R. Rahman", "Rockstar OST"
        );

        tg.displayData();
        cd.displayData();
    }
}
