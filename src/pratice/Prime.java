package pratice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Check if a Number is Prime
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		
		int n=sc.nextInt();
		
		boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n% i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n  +"is not a prime number");

	}

}
