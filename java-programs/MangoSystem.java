public class MangoSystem {

    interface Mango {
        void display();
        void taste();
    }

    static class Winter implements Mango {
        @Override
        public void display() {
            System.out.println("Winter Mango: Available in winter season.");
        }

        @Override
        public void taste() {
            System.out.println("Winter Mango Taste: Mildly sweet and less juicy.");
        }
    }

    static class Summer implements Mango {
        @Override
        public void display() {
            System.out.println("Summer Mango: Available in summer season.");
        }

        @Override
        public void taste() {
            System.out.println("Summer Mango Taste: Very sweet, juicy and ripe.");
        }
    }

    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        System.out.println("===== Winter =====");
        w.display();
        w.taste();

        System.out.println("\n===== Summer =====");
        s.display();
        s.taste();
    }
}
