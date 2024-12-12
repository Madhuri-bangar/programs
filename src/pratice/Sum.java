//write a program to sum 3 no
package pratice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st no: ");
		int no1=sc.nextInt();
		
		System.out.println("enter the 2nd no: ");
		int no2=sc.nextInt();
		
		System.out.println("enter the 3rd no: ");
		int no3=sc.nextInt();
		
		int sum=no1+no2+no3;
		System.out.println("sum of 3 no is  " +sum);
		sc.close();
	}

}
