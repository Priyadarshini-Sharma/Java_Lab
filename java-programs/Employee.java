public class Employee {
    private String name;
    private String department;
    private double salary;
    static String companyName = "Infosys Ltd.";

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name + " | Dept: " + department + " | Salary: " + salary);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Employee[] emp = {
            new Employee("Priya",   "CSE",       75000),
            new Employee("Rahul",   "IT",        68000),
            new Employee("Sneha",   "HR",        52000),
            new Employee("Arjun",   "Finance",   81000),
            new Employee("Meera",   "Marketing", 61000)
        };

        for (Employee e : emp)
            e.display();
    }
}