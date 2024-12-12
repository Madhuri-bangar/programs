package udemyjava_oop;
//this keyword
public class Student_this {
    // Data members
    private int sid;
    private String sname;
    private double gpa;
    private static String university = "sppu";
    private String city;
    
    // Constructor with three parameters
    public Student_this(int sid, String sname, double gpa) { // No return type
        this.sid = sid;
        this.sname = sname;
        this.gpa = gpa;
    }
    
    // Constructor with four parameters (constructor chaining)
    public Student_this(int sid, String sname, double gpa, String city) { // No return type
        this(sid, sname, gpa); // Calls the constructor with three parameters
        this.city = city;
    }
    
    // Getter/accessor for all
    public void getStudent() {
        System.out.println(sid + " " + sname + " " + gpa + " " + city + " " + university);
    }
    
    public static void main(String[] args) {
        Student_this s1 = new Student_this(101, "om", 9.0); // Old object - no city
        s1.getStudent();
        
        Student_this s2 = new Student_this(1223, "madhu", 9.7, "pune"); // New object - with city
        s2.getStudent();
    }
}
