public class TollBooth {
    int totalCars;
    int unpaidCars;
    double cashCollected;

    TollBooth() {
        totalCars = 0;
        unpaidCars = 0;
        cashCollected = 0;
    }

    void carPaid() {
        totalCars++;
        cashCollected += 50;
    }

    void carNoPay() {
        totalCars++;
        unpaidCars++;
    }

    void displayReport() {
        System.out.println("Total cars passed       : " + totalCars);
        System.out.println("Cars without payment    : " + unpaidCars);
        System.out.println("Total cash collected    : Rs. " + cashCollected);
    }

    public static void main(String[] args) {
        TollBooth booth = new TollBooth();

        // Simulating cars
        booth.carPaid();
        booth.carPaid();
        booth.carNoPay();
        booth.carPaid();
        booth.carNoPay();
        booth.carNoPay();
        booth.carPaid();
        booth.carPaid();

        booth.displayReport();
    }
}
