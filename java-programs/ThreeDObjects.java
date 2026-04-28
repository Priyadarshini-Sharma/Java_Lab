public class ThreeDObjects {

    abstract static class ThreeDObject {
        abstract double wholeSurfaceArea();
        abstract double volume();

        void display(String shape) {
            System.out.println("===== " + shape + " =====");
            System.out.printf("Surface Area : %.2f%n", wholeSurfaceArea());
            System.out.printf("Volume       : %.2f%n", volume());
            System.out.println();
        }
    }

    static class Box extends ThreeDObject {
        double l, b, h;
        Box(double l, double b, double h) {
            this.l = l; this.b = b; this.h = h;
        }
        @Override public double wholeSurfaceArea() { return 2 * (l*b + b*h + h*l); }
        @Override public double volume()           { return l * b * h; }
    }

    static class Cube extends ThreeDObject {
        double side;
        Cube(double side) { this.side = side; }
        @Override public double wholeSurfaceArea() { return 6 * side * side; }
        @Override public double volume()           { return side * side * side; }
    }

    static class Cylinder extends ThreeDObject {
        double r, h;
        Cylinder(double r, double h) { this.r = r; this.h = h; }
        @Override public double wholeSurfaceArea() { return 2 * Math.PI * r * (r + h); }
        @Override public double volume()           { return Math.PI * r * r * h; }
    }

    static class Cone extends ThreeDObject {
        double r, h;
        Cone(double r, double h) { this.r = r; this.h = h; }
        double slantHeight()     { return Math.sqrt(r*r + h*h); }
        @Override public double wholeSurfaceArea() { return Math.PI * r * (r + slantHeight()); }
        @Override public double volume()           { return (1.0/3) * Math.PI * r * r * h; }
    }

    public static void main(String[] args) {
        ThreeDObject obj;

        obj = new Box(5, 4, 3);
        obj.display("Box (5x4x3)");

        obj = new Cube(4);
        obj.display("Cube (side=4)");

        obj = new Cylinder(3, 7);
        obj.display("Cylinder (r=3, h=7)");

        obj = new Cone(3, 7);
        obj.display("Cone (r=3, h=7)");
    }
}
