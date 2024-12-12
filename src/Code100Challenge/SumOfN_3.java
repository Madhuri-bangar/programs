package Code100Challenge;

import java.util.Scanner;

// Find the Sum of First N Natural Numbers in Java
public class SumOfN_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int num = sc.nextInt();  
        int sum = 0;  // Initialize sum variable

        for(int i = 1; i <= num; i++) {
            sum += i;  
        }

        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);

        sc.close();  
    }
}
