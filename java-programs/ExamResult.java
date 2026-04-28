public class ExamResult {

    interface Exam {
        double Percent_cal(double marks1, double marks2);
    }

    static class Student {
        String name;
        int roll_no;
        double marks1, marks2;

        Student(String name, int roll_no, double marks1, double marks2) {
            this.name    = name;
            this.roll_no = roll_no;
            this.marks1  = marks1;
            this.marks2  = marks2;
        }

        void show() {
            System.out.println("Name    : " + name);
            System.out.println("Roll No : " + roll_no);
            System.out.println("Marks 1 : " + marks1);
            System.out.println("Marks 2 : " + marks2);
        }
    }

    static class Result extends Student implements Exam {
        double per;

        Result(String name, int roll_no, double marks1, double marks2) {
            super(name, roll_no, marks1, marks2);
            this.per = Percent_cal(marks1, marks2);
        }

        @Override
        public double Percent_cal(double marks1, double marks2) {
            return (marks1 + marks2) / 2.0;
        }

        void display() {
            System.out.println("========== Result ==========");
            show();
            System.out.println("Percentage : " + per + "%");
            System.out.println("============================");
        }
    }

    public static void main(String[] args) {
        Result r1 = new Result("Priya", 101, 88, 92);
        Result r2 = new Result("Rahul", 102, 74, 68);

        r1.display();
        r2.display();
    }
}