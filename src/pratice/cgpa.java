package pratice;

import java.util.Scanner;

public class cgpa {

    // Method to convert marks to grade points
    public static double convertToGradePoint(int marks) {
        return marks / 10.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for subject 1 (out of 100): ");
        int marks1 = sc.nextInt();
        
        System.out.println("Enter marks for subject 2 (out of 100): ");
        int marks2 = sc.nextInt();
        
        System.out.println("Enter marks for subject 3 (out of 100): ");
        int marks3 = sc.nextInt();
        
        // Convert marks to grade points
        double grade1 = convertToGradePoint(marks1);
        double grade2 = convertToGradePoint(marks2);
        double grade3 = convertToGradePoint(marks3);
        
        // Calculate CGPA
        double cgpa = (grade1 + grade2 + grade3) / 3;
        
        System.out.println("The CGPA is: " + cgpa);
        
        sc.close(); // Close the scanner to avoid resource leak
    }
}
