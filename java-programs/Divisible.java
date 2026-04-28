class Divisible{
    int n;
    Divisible(int num){
        n=num;
    }
    void check(){
        if(n%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
    public static void main(String[] args) {
        Divisible obj =new Divisible(25);
        obj.check();
    }
}
