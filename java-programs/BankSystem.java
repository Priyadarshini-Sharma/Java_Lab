public class BankSystem {

    interface Bank {
        double RATE_OF_INTEREST = 7.5;
        void displayBankInfo();
    }

    static class Customer {
        String customerName;
        int customerId;

        Customer(String customerName, int customerId) {
            this.customerName = customerName;
            this.customerId = customerId;
        }

        void displayCustomer() {
            System.out.println("Customer Name : " + customerName);
            System.out.println("Customer ID   : " + customerId);
        }
    }

    static class Account extends Customer implements Bank {
        String accountNumber;
        double balance;

        Account(String customerName, int customerId, String accountNumber, double balance) {
            super(customerName, customerId);
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        @Override
        public void displayBankInfo() {
            System.out.println("Bank          : National Bank of India");
            System.out.println("Rate of Interest: " + RATE_OF_INTEREST + "%");
        }

        double calculateInterest() {
            return balance * RATE_OF_INTEREST / 100;
        }

        void displayAccount() {
            System.out.println("========== Account Details ==========");
            displayCustomer();
            displayBankInfo();
            System.out.println("Account No    : " + accountNumber);
            System.out.println("Balance       : Rs. " + balance);
            System.out.println("Interest Earned: Rs. " + calculateInterest());
            System.out.println("=====================================");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account("Priya", 1001, "ACC98765", 50000);
        acc.displayAccount();
    }
}