class Swap {
    int a, b;
    Swap(int x, int y){
        a=x;
        b=y;
    }
    void swapNumbers(){
        System.out.println("Before swap: " + a +"   " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: " + a +"   " + b);
    }
    public static void main(String[] args) {
        Swap obj1= new Swap(5,10);
        Swap obj2= new Swap(20,30);

        obj1.swapNumbers();
        obj2.swapNumbers();
        
    }
}
