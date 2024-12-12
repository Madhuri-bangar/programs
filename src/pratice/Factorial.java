package pratice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// calculate the factorial of given number using a loop
		//factorial 5!=1*2*3*4*5=120
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		
	int result=1;
	for(int i=1; i<=n;i++) {
		result=result*i;
	}
		System.out.println("the factorial of "+n+"is"+result);
		sc.close();

	}

}
