class Grade{
    int percent;

    Grade(int p){
        percent=p;
    }
    void showGrade(){
        if(percent>=90){
             System.out.println("Grade A");
        }
        else if(percent>=80){
             System.out.println("Grade B");
        }
        else if(percent>=70){
             System.out.println("Grade C");
        }
        else if(percent>=60){
             System.out.println("Grade D");
        }
        else if(percent>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
    public static void main(String[] args){
        Grade obj = new Grade(99);
        obj.showGrade();
    }
}
