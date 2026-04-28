public class BankingSystem {

    // Base class
    static class BankAccount {
        String accountNumber;
        double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount > balance)
                System.out.println("Insufficient funds!");
            else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }

        void displayBalance() {
            System.out.println("Account: " + accountNumber + " | Balance: " + balance);
        }
    }

    // Level 1 derived class
    static class SavingsAccount extends BankAccount {
        double interestRate;

        SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        void addInterest() {
            balance += balance * interestRate / 100;
            System.out.println("Interest added. New Balance: " + balance);
        }
    }

    // Level 2 derived class
    static class FixedDepositAccount extends SavingsAccount {
        int maturityPeriod; // in months

        FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
            super(accountNumber, balance, interestRate);
            this.maturityPeriod = maturityPeriod;
        }

        void calculateMaturityAmount() {
            double amount = balance;
            for (int i = 0; i < maturityPeriod; i++)
                amount += amount * interestRate / 100;
            System.out.println("Maturity Amount after " + maturityPeriod + " months: " + amount);
        }
    }

    public static void main(String[] args) {
        FixedDepositAccount fd = new FixedDepositAccount("FD1001", 10000, 5, 12);

        fd.displayBalance();
        fd.deposit(5000);
        fd.displayBalance();
        fd.addInterest();
        fd.calculateMaturityAmount();
    }
}
