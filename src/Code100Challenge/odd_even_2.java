package Code100Challenge;

import java.util.Scanner;

public class odd_even_2 {
//Check Whether a Number is Even or Odd in Java
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check number");
		int num=sc.nextInt();
	
		if(num%2==0) {
			System.out.println("num is even");
		}
		else {
			System.out.println("num is odd");
		}
		

	}

}
