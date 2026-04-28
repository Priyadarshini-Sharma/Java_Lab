public class ItemArray {

    static class Item {
        int code;
        double price;

        Item(int code, double price) {
            this.code = code;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(101, 250.50),
            new Item(102, 899.00),
            new Item(103, 450.75),
            new Item(104, 120.00),
            new Item(105, 675.25)
        };

        System.out.println("----------------------------");
        System.out.printf("%-10s %-10s%n", "Code", "Price");
        System.out.println("----------------------------");

        double total = 0;
        for (Item item : items) {
            System.out.printf("%-10d %-10.2f%n", item.code, item.price);
            total += item.price;
        }

        System.out.println("----------------------------");
        System.out.printf("Total Price: %.2f%n", total);
    }
}
