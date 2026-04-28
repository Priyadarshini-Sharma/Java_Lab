public class CirclePoint {

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Circle {
        Point center;
        double radius;

        Circle(double x, double y, double radius) {
            this.center = new Point(x, y);
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }

        void display() {
            System.out.println("Center Point: (" + center.x + ", " + center.y + ")");
            System.out.println("Radius      : " + radius);
            System.out.printf("Area        : %.2f%n", area());
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0, 4.0, 7.5);
        c.display();
    }
}
