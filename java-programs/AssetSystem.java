public class AssetSystem {

    abstract static class Asset {
        String descriptor;
        String date;
        double currentValue;

        Asset(String descriptor, String date, double currentValue) {
            this.descriptor   = descriptor;
            this.date         = date;
            this.currentValue = currentValue;
        }

        abstract void displayDetails();
    }

    static class Stock extends Asset {
        int    numShares;
        double sharePrice;

        Stock(String descriptor, String date, double currentValue,
              int numShares, double sharePrice) {
            super(descriptor, date, currentValue);
            this.numShares  = numShares;
            this.sharePrice = sharePrice;
        }

        @Override
        public void displayDetails() {
            System.out.println("===== Stock =====");
            System.out.println("Descriptor    : " + descriptor);
            System.out.println("Date          : " + date);
            System.out.println("Current Value : Rs. " + currentValue);
            System.out.println("Num Shares    : " + numShares);
            System.out.println("Share Price   : Rs. " + sharePrice);
            System.out.println("Asset Value   : Rs. " + (numShares * sharePrice));
            System.out.println("=================");
        }
    }

    static class Bond extends Asset {
        double interestRate;

        Bond(String descriptor, String date, double currentValue, double interestRate) {
            super(descriptor, date, currentValue);
            this.interestRate = interestRate;
        }

        @Override
        public void displayDetails() {
            System.out.println("===== Bond =====");
            System.out.println("Descriptor    : " + descriptor);
            System.out.println("Date          : " + date);
            System.out.println("Current Value : Rs. " + currentValue);
            System.out.println("Interest Rate : " + interestRate + "%");
            System.out.println("Interest Amt  : Rs. " + (currentValue * interestRate / 100));
            System.out.println("================");
        }
    }

    static class Savings extends Asset {
        double interestRate;

        Savings(String descriptor, String date, double currentValue, double interestRate) {
            super(descriptor, date, currentValue);
            this.interestRate = interestRate;
        }

        @Override
        public void displayDetails() {
            System.out.println("===== Savings =====");
            System.out.println("Descriptor    : " + descriptor);
            System.out.println("Date          : " + date);
            System.out.println("Current Value : Rs. " + currentValue);
            System.out.println("Interest Rate : " + interestRate + "%");
            System.out.println("Interest Amt  : Rs. " + (currentValue * interestRate / 100));
            System.out.println("===================");
        }
    }

    public static void main(String[] args) {
        Asset a;

        a = new Stock("TCS Shares", "28-04-2025", 150000, 100, 3500);
        a.displayDetails();

        a = new Bond("Govt Bond", "28-04-2025", 50000, 7.5);
        a.displayDetails();

        a = new Savings("FD Savings", "28-04-2025", 75000, 6.0);
        a.displayDetails();
    }
}
