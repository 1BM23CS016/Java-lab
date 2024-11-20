import java.util.Scanner;
class Subject {
    int subjectMarks;
    int credits;
    int grade;


    void calculateGrade() {
        if (subjectMarks >= 90) {
            grade = 10;
        } else if (subjectMarks >= 80) {
            grade = 9;
        } else if (subjectMarks >= 70) {
            grade = 8;
        } else if (subjectMarks >= 60) {
            grade = 7;
        } else if (subjectMarks >= 50) {
            grade = 6;
        } else if (subjectMarks >= 40) {
            grade = 5;
        } else {
            grade = 0; // Fail
        }
    }
}

class Student {
    String usn;
    String name;
    double SGPA;
    Subject[] subjects = new Subject[8];
    Scanner scanner = new Scanner(System.in);


    Student() {
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
    }

 
    void getStudentDetails() {
        System.out.print("Enter the USN: ");
        usn = scanner.next();
        System.out.print("Enter the Name: ");
        name = scanner.next();
    }
    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjects[i].subjectMarks = scanner.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subjects[i].credits = scanner.nextInt();
            subjects[i].calculateGrade();
        }
    }

  
    void computeSGPA() {
        double effectiveScore = 0;
        int totalCredits = 0;

        for (int i = 0; i < 8; i++) {
            effectiveScore += (subjects[i].grade * subjects[i].credits);
            totalCredits += subjects[i].credits;
        }
        SGPA = (totalCredits > 0) ? (effectiveScore / totalCredits) : 0;
    }

  
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + SGPA);
    }
}

public class StudDetails {
    public static void main(String[]args) {
        Student[] students = new Student[3];

        for (int j = 0; j < 3; j++) {
            System.out.println("Enter the details for student " + (j + 1) + ":");
            students[j] = new Student();
            students[j].getStudentDetails();
            students[j].getMarks();
            students[j].computeSGPA();
        }

        for (Student student : students) {
            student.display();
        }
    }
}
