package udemyjava;

import java.util.*;

public class ExceptionDemo {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no:");
	int a=0;int b=0;
	try {
	 a=sc.nextInt();//int-java.util.InputMismatchException
	 b=sc.nextInt();//int-java.util.InputMismatchException
	 
	 int res=a/b;//throw new java.lang.ArithmeticExcption();
		System.out.println("result="+res);
	}
	catch(Exception e) {
	System.err.println(e);
	}
	
	
	int sum=a+b;
	System.out.println("sum="+sum);
	
	int prod=a*b;
	System.out.println("product="+prod);
	
	System.out.println("rest of the code...follows");
}
}
