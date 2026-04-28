public class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor (1 parameter)
    Student(String n) {
        name = n;
        age = 18;
    }

    // Parameterized constructor (2 parameters)
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Priya");
        Student s3 = new Student("Riya", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
