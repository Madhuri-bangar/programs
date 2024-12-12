package udemyjava;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//reading data from user
		// 1. command line arguments
		
		  //System.out.println("your good name:"+args[0]);
//***************************************
		
		//2 scanner
		/*
		Scanner in =new Scanner(System.in);
		System.out.println("Enter name and age");
		String name=in.next();
		int age=in.nextInt();
		
		System.out.println("Name:"+name+"\nAge:");
		*/
		
		/*3 bufferedreader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name and age");
		String n=br.readLine(); //IOException
		int a=Integer.parseInt(br.readLine()); //int 
		System.out.println("Name:"+n+"\nAge:"+a);
	
	*/
		
		//4.console class
		Console c=System.console();//no new keyword
		System.out.println("Enter city and pin");
		String city=c.readLine(); //does not throw ioException
	int pin=Integer.parseInt(c.readLine());
	
	System.out.println("City:"+city+"\nPin:"+pin);
	System.out.println("Enter password:");
	char pwd[]=c.readPassword();
	System.out.println(pwd);
	}

}
