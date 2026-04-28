public class EmployeePayroll {
    int empNo;
    String name, department;
    double basicPay, DA, HRA, grossSalary;

    EmployeePayroll(int empNo, String name, String department, double basicPay) {
        this.empNo = empNo;
        this.name = name;
        this.department = department;
        this.basicPay = basicPay;
        this.DA = basicPay * 0.40;   // 40% of basic
        this.HRA = basicPay * 0.20;  // 20% of basic
        this.grossSalary = basicPay + DA + HRA;
    }

    void display() {
        System.out.println("Emp No: " + empNo + " | Name: " + name +
            " | Dept: " + department +
            " | Basic: " + basicPay +
            " | DA: " + DA +
            " | HRA: " + HRA +
            " | Gross: " + grossSalary);
    }

    public static void main(String[] args) {
        EmployeePayroll[] emp = {
            new EmployeePayroll(101, "Priya",  "CSE",       50000),
            new EmployeePayroll(102, "Rahul",  "IT",        62000),
            new EmployeePayroll(103, "Sneha",  "HR",        45000),
            new EmployeePayroll(104, "Arjun",  "Finance",   71000),
            new EmployeePayroll(105, "Meera",  "Marketing", 38000)
        };

        System.out.println("All Employees:");
        EmployeePayroll highest = emp[0];
        for (EmployeePayroll e : emp) {
            e.display();
            if (e.grossSalary > highest.grossSalary)
                highest = e;
        }

        System.out.println("\nEmployee with Highest Gross Salary:");
        highest.display();
    }
}
