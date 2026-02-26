class ReverseNumber{
    int num;
    ReverseNumber(int n){
        num=n;
    }
    void reverse(){
        int rev = 0;
        int digit;
        while(num!=0){
            
            digit= num%10;
            rev = ( rev * 10 ) + digit;
            num = num / 10;
        }
        System.out.println("Reversed number = " + rev);
    }
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber(2798);
        obj.reverse();
    }
}
