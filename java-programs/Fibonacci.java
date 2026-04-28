class Fibonacci {
    int n;
    Fibonacci(int num){
        n=num;
    }
    void showSeries(){
        int a=0, b=1;
        System.out.println("Fibonacci:");

        for(int i=1;i<=n;i++){
            System.out.println(a + "  ");
            int c= a + b;
            a=b;
            b=c;
        }
    }
public static void  main(String[] args){
    Fibonacci obj = new Fibonacci(10);
    obj.showSeries();
}
}
