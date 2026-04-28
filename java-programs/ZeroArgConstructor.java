public class ZeroArgConstructor {
    String name;
    int age;

    ZeroArgConstructor() {
        name = "Default Name";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ZeroArgConstructor obj = new ZeroArgConstructor();
        obj.display();
    }
}
