import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's grade for Assignment 1: ");
        double assignment1 = scanner.nextDouble();

        System.out.print("Enter student's grade for Assignment 2: ");
        double assignment2 = scanner.nextDouble();

        System.out.print("Enter student's grade for Midterm Exam: ");
        double midterm = scanner.nextDouble();

        System.out.print("Enter student's grade for Final Exam: ");
        double finalExam = scanner.nextDouble();

        double totalGrade = calculateTotalGrade(assignment1, assignment2, midterm, finalExam);
        char letterGrade = calculateLetterGrade(totalGrade);

        System.out.println("Student's Name: " + name);
        System.out.println("Total Grade: " + totalGrade);
        System.out.println("Letter Grade: " + letterGrade);
    }

    public static double calculateTotalGrade(double assignment1, double assignment2, double midterm, double finalExam) {
        return (assignment1 + assignment2 + midterm + finalExam) / 4;
    }

    public static char calculateLetterGrade(double totalGrade) {
        if (totalGrade >= 90) {
            return 'A';
        } else if (totalGrade >= 80) {
            return 'B';
        } else if (totalGrade >= 70) {
            return 'C';
        } else if (totalGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}