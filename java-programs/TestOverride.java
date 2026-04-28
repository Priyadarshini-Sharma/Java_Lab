class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.sound(); // Parent class
        b.sound(); // Child class (overridden)
    }
}
