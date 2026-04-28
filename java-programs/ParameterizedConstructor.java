public class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Priya", 20);
        obj.display();
    }
}
