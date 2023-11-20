
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSubjects;
        int totalMarks = 0;

        System.out.print("Enter the total number of subjects: ");
        totalSubjects = scanner.nextInt();

        
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int subjectMarks = scanner.nextInt();

           
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                i--; 
            } else {
                totalMarks += subjectMarks;
            }
        }

        
        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;

        
        String grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

   
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
