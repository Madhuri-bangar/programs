package udemyjava_oop;
//constructor
//1 /parameterized constructor
public class Student {
//data members
	private int sid;
	private String sname;
	private double gpa;
	private static String clg="coep";
	
	//default cons
	public Student() {
		//no code-->primary respo:construct instance with their defaults
	System.out.println("it is default constructor");
	}
	
	//parameterized constructor
	public Student(int id,String name,double avg) {
		sid=id;
		sname=name;
		gpa=avg;
	}
	public void getStudent() {
		System.out.println(sid+" "+sname+" "+gpa+" "+clg);
		
	}
	public static void main(String[] args) {
		Student s1= new Student(101,"om",9.1);//parameterized 
	s1.getStudent();
	
	Student s2=new Student(); //default
	s2.getStudent();// 0 null 0.0
	}
}

//constructor overloading 
//method overloding
