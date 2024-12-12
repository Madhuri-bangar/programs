// Import necessary utilities
import java.util.Scanner;
//import java.util.Date; //explicit import
public class MainDate { 

    public static void main(String[] args) {
       // Date d = new Date(); // Create a Date object from java.util.Date
       java.util.Date d=new java.util.Date();//FQN
        System.out.println("Todays  current timestamp"+d); // Print the current date and time
       
    Scanner in=new Scanner(System.in);
    System.out.println("enter your name");
    String name=in.next();
    System.out.println("hello"+name);
    
    }
}