public class AccountSystem {

    abstract static class Accounts {
        double balance;
        String accountNumber;
        String accountHoldersName;
        String address;

        Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
            this.accountNumber      = accountNumber;
            this.accountHoldersName = accountHoldersName;
            this.address            = address;
            this.balance            = balance;
        }

        abstract void withdrawal(double amount);
        abstract void deposit(double amount);

        void display() {
            System.out.println("Account No    : " + accountNumber);
            System.out.println("Holder Name   : " + accountHoldersName);
            System.out.println("Address       : " + address);
            System.out.println("Balance       : Rs. " + balance);
        }
    }

    static class SavingsAccount extends Accounts {
        double rateOfInterest;

        SavingsAccount(String accountNumber, String name, String address,
                       double balance, double rateOfInterest) {
            super(accountNumber, name, address, balance);
            this.rateOfInterest = rateOfInterest;
        }

        @Override
        public void withdrawal(double amount) {
            if (amount > balance)
                System.out.println("Insufficient balance!");
            else {
                balance -= amount;
                System.out.println("Withdrawn Rs. " + amount + " | New Balance: Rs. " + balance);
            }
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " | New Balance: Rs. " + balance);
        }

        void calculateAmount() {
            double interest = balance * rateOfInterest / 100;
            System.out.println("Interest Rate : " + rateOfInterest + "%");
            System.out.println("Interest Amt  : Rs. " + interest);
            System.out.println("Total Amount  : Rs. " + (balance + interest));
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1001", "Priya", "Kolkata", 25000, 6.5);

        System.out.println("===== Account Details =====");
        sa.display();
        sa.deposit(5000);
        sa.withdrawal(3000);
        System.out.println("\n===== Interest Calculation =====");
        sa.calculateAmount();
    }
}
