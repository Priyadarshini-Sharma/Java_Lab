public class CollegeSystem {

    interface Department {
        String deptName = "Computer Science";
        String deptHead = "Dr. Sharma";

        void printDeptDetails();
    }

    static class Hostel {
        private String hostelName;
        private String hostelLocation;
        private int numberOfRooms;

        Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
            this.hostelName = hostelName;
            this.hostelLocation = hostelLocation;
            this.numberOfRooms = numberOfRooms;
        }

        String getHostelName()     { return hostelName; }
        String getHostelLocation() { return hostelLocation; }
        int getNumberOfRooms()     { return numberOfRooms; }

        void printHostelDetails() {
            System.out.println("Hostel Name    : " + hostelName);
            System.out.println("Location       : " + hostelLocation);
            System.out.println("Number of Rooms: " + numberOfRooms);
        }
    }

    static class Student extends Hostel implements Department {
        private String studentName;
        private String regdNo;
        private String electiveSubject;
        private double avgMarks;

        Student(String studentName, String regdNo, String electiveSubject,
                double avgMarks, String hostelName, String hostelLocation, int rooms) {
            super(hostelName, hostelLocation, rooms);
            this.studentName = studentName;
            this.regdNo = regdNo;
            this.electiveSubject = electiveSubject;
            this.avgMarks = avgMarks;
        }

        String getRegdNo() { return regdNo; }

        @Override
        public void printDeptDetails() {
            System.out.println("Department     : " + deptName);
            System.out.println("Dept Head      : " + deptHead);
        }

        void printData() {
            System.out.println("========== Student Details ==========");
            System.out.println("Name           : " + studentName);
            System.out.println("Reg No         : " + regdNo);
            System.out.println("Elective       : " + electiveSubject);
            System.out.println("Avg Marks      : " + avgMarks);
            printDeptDetails();
            printHostelDetails();
            System.out.println("=====================================");
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Priya",  "REG001", "AI",         88.5, "Saraswati Hostel", "Block A", 50),
            new Student("Rahul",  "REG002", "Networking",  76.0, "Vivekananda Hostel","Block B", 40),
            new Student("Sneha",  "REG003", "Data Science",91.0, "Saraswati Hostel", "Block A", 50)
        };

        // Option i: Admit new student — display newly admitted
        System.out.println("=== Option 1: Admit New Student ===");
        students[0].printData();

        // Option ii: Migrate student — search by Reg No
        System.out.println("\n=== Option 2: Migrate Student (Search REG002) ===");
        String searchReg = "REG002";
        for (Student s : students) {
            if (s.getRegdNo().equals(searchReg)) {
                System.out.println("Student found. Migrating...");
                s.printData();
            }
        }

        // Option iii: Display all
        System.out.println("\n=== Option 3: Display All Students ===");
        for (Student s : students)
            s.printData();
    }
}
