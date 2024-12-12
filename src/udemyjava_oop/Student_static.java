package udemyjava_oop;
//static keyword
//static method
public class Student_static {

	
		 private int sid;
		    private String sname;
		    private double gpa;
		    private static String university ;//class area
		    private String city;
		    
		    static {
		    	university="JNU DElhi"; //static block-executed during class loading
		  System.out.println("it is a static block ----it gets excuted before main--- ");
		    }
		    
		    // Constructor with three parameters
		    public Student_static(int sid, String sname, double gpa) { // No return type
		        this.sid = sid;
		        this.sname = sname;
		        this.gpa = gpa;
		    }
		    
		    // Constructor with four parameters (constructor chaining)
		    public Student_static(int sid, String sname, double gpa, String city) { // No return type
		        this(sid, sname, gpa); // Calls the constructor with three parameters
		        this.city = city;
		    }
		    
		    // Getter/accessor for all
		    public void getStudent() {
		        System.out.println(sid + " " + sname + " " + gpa + " " + city + " " + university);
		    }
		    public static void change() {
		    	university="iit";
		    }
		    
		    public static void main(String[] args) {
		        Student_static s1 = new Student_static(101, "om", 9.0); // Old object - no city
		        s1.getStudent();
		        
		        Student_static.change();//calling static method
		        
		        Student_static s2 = new Student_static(1223, "madhu", 9.7, "pune"); // New object - with city
		        s2.getStudent();
	}

}
