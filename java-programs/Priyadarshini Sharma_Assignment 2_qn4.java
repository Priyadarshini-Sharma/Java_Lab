class LeapYear {
    int year;

    public LeapYear(int y) {
        year = y;
    }
    void checkLeap(){
        if (year % 4 == 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    public static void main(String[] args) {
        LeapYear obj = new LeapYear(2028);
        obj.checkLeap();
    }
}
