package Code100Challenge;

import java.util.Scanner;

public class positive_negative_1 {
//Check if a Number is Positive or Negative in Java
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number:");
		
		int num=sc.nextInt();
		if(num>0) 
		{
			System.out.println("number is +ve");
			}
			else if(num<0)
			{
				 System.out.println("number is -ve");
			}
				 else
				 {
			System.out.println("zero");
			}
			}
		}
	


