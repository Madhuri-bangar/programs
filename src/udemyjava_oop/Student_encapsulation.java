package udemyjava_oop;

public class Student_encapsulation {//fully encapsulated class

	private int sid;
	private String sname;
	private double gpa;
	private static String university="sppu";
	
	public void setStudent_encapsulation(int id,String name,double avg) {
		sid=id;
		sname=name;
		gpa=avg;
		
	}
public void getStudent_encapsulation(){
	System.out.println(sid+" "+sname+" "+gpa+" "+university);
}
//getter for sname
public void getSname() {
	System.out.println(sname);
}
}
//run through test_encap
