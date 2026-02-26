class Factorial {
    
    int cal_Factorial(int n){
        int factorial=1;
        int i;
        for (i=1; i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int num =5;
        Factorial obj=new Factorial();
        int result=obj.cal_Factorial(num);
        System.out.println("Factorial of "+ num +" is " + result);
    }
}