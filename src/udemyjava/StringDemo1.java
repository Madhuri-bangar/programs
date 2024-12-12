package udemyjava;

public class StringDemo1 {

	public static void main(String[] args) {
	java.util.Scanner in=new java.util.Scanner(System.in);
	String s1="welcome to java";
	System.out.println(s1.length());//15

	System.out.println(s1.substring(6)); //e to java
	System.out.println(s1.substring(0));//whole string
	System.out.println(s1.substring(0,7));
	System.out.println(s1.substring(11,14));//jav
	
	//read a character from the keyboard or user 
	
	System.out.println("enter a character");
	String str=in.next();
	char ch=str.charAt(0);
	System.out.println("character");
	}

}
