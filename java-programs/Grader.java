public class Grader {
    double score;

    Grader(double score) {
        this.score = score;
    }

    String letterGrade() {
        if (score >= 90) return "O";
        else if (score >= 80) return "E";
        else if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        double inputScore = 85;

        if (inputScore < 0 || inputScore > 100) {
            System.out.println("Invalid Input");
        } else {
            Grader obj = new Grader(inputScore);
            System.out.println("Score: " + obj.score);
            System.out.println("Grade: " + obj.letterGrade());
        }
    }
}
