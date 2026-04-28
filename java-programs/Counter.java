public class Counter {
    static int cnt = 0;
    String name;

    Counter(String name) {
        this.name = name;
        cnt++;
        System.out.println("Object '" + name + "' created. Total count: " + cnt);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter("Object1");
        Counter obj2 = new Counter("Object2");
        Counter obj3 = new Counter("Object3");

        System.out.println("Total objects created: " + Counter.cnt);
    }
}
