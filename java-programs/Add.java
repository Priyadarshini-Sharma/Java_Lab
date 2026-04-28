class Add {

    // Add two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Add three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Add obj = new Add();

        System.out.println("Sum of 2 ints: " + obj.sum(2, 3));
        System.out.println("Sum of 3 ints: " + obj.sum(2, 3, 4));
        System.out.println("Sum of doubles: " + obj.sum(2.5, 3.5));
    }
}
