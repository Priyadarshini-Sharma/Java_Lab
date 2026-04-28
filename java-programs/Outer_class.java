class Outer_class {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x from Outer class: " + x);
        }
    }
}


public class qn2 {
    public static void main(String[] args) {
        
        Outer_class obj = new Outer_class();

        
        Outer_class.Inner object = obj.new Inner();
        
        object.display();
    }
}
