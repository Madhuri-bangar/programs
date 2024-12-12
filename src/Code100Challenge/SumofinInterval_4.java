package Code100Challenge;

import java.util.Scanner;

public class SumofinInterval_4 {
    // Find the Sum of the Numbers in a Given Interval in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interval start: ");
        int start = sc.nextInt();
        System.out.println("Enter the interval end: ");
        int end = sc.nextInt();
        
        int sum = 0;  // Initialize sum variable
        
        for(int i = start; i <= end; i++) {
            sum += i; 
        }
        
        System.out.println("The sum of the numbers from " + start + " to " + end + " is: " + sum);

    }
}
