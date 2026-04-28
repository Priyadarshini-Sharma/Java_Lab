class NumberCheck{
    int n;

    public NumberCheck(int num) {
        n = num;
    }
    void check(){
        if (n>0){
            System.out.println("Positive number");
        }
        else if(n<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("The number is equal to zero.");
        }
    }
    public static void main(String[] args){
        NumberCheck obj =new NumberCheck(-6);
        obj.check();
    }
}
