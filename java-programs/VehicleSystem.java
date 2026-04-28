public class VehicleSystem {

    abstract static class MotorVehicle {
        String modelName;
        String modelNumber;
        double modelPrice;

        MotorVehicle(String modelName, String modelNumber, double modelPrice) {
            this.modelName   = modelName;
            this.modelNumber = modelNumber;
            this.modelPrice  = modelPrice;
        }

        abstract void display();
    }

    static class Car extends MotorVehicle {
        double discountRate;

        Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
            super(modelName, modelNumber, modelPrice);
            this.discountRate = discountRate;
        }

        double discount() {
            return modelPrice * discountRate / 100;
        }

        @Override
        public void display() {
            System.out.println("===== Car Details =====");
            System.out.println("Model Name    : " + modelName);
            System.out.println("Model Number  : " + modelNumber);
            System.out.printf ("Model Price   : Rs. %.2f%n", modelPrice);
            System.out.println("Discount Rate : " + discountRate + "%");
            System.out.printf ("Discount Amt  : Rs. %.2f%n", discount());
            System.out.printf ("Final Price   : Rs. %.2f%n", modelPrice - discount());
            System.out.println("=======================");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tata Nexon",  "NX2024", 1500000, 10);
        Car c2 = new Car("Honda City",  "HC2024", 1200000, 8);

        c1.display();
        c2.display();
    }
}
