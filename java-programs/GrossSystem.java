public class GrossSystem {

    interface Gross {
        double HRA_PERCENT = 20.0;
        double DA_PERCENT  = 40.0;

        double calculateGross();
    }

    static class Employee {
        String name;
        int empId;

        Employee(String name, int empId) {
            this.name = name;
            this.empId = empId;
        }

        void displayEmployee() {
            System.out.println("Employee Name : " + name);
            System.out.println("Employee ID   : " + empId);
        }
    }

    static class Salary extends Employee implements Gross {
        double basicPay;

        Salary(String name, int empId, double basicPay) {
            super(name, empId);
            this.basicPay = basicPay;
        }

        @Override
        public double calculateGross() {
            double hra = basicPay * Gross.HRA_PERCENT / 100;
            double da  = basicPay * Gross.DA_PERCENT  / 100;
            return basicPay + hra + da;
        }

        void displaySalary() {
            double hra   = basicPay * Gross.HRA_PERCENT / 100;
            double da    = basicPay * Gross.DA_PERCENT  / 100;
            double gross = calculateGross();

            System.out.println("========== Salary Details ==========");
            displayEmployee();
            System.out.println("Basic Pay     : Rs. " + basicPay);
            System.out.println("HRA (20%)     : Rs. " + hra);
            System.out.println("DA  (40%)     : Rs. " + da);
            System.out.println("Gross Salary  : Rs. " + gross);
            System.out.println("=====================================");
        }
    }

    public static void main(String[] args) {
        Salary s = new Salary("Priya", 101, 50000);
        s.displaySalary();
    }
}