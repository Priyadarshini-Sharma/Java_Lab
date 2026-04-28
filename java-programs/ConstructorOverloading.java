public class ConstructorOverloading {
    String name;
    int age;
    String city;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
        city = "Unknown";
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Unknown";
    }

    ConstructorOverloading(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Priya", 20);
        ConstructorOverloading obj3 = new ConstructorOverloading("Priya", 20, "Kolkata");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}