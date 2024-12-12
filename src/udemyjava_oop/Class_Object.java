package udemyjava_oop;

public class Class_Object {//default specifier

	
		//data members
		int sid;   //instance
		String sname;
		double CGPA;
		static String clg="coep"; //class -class area
		
		
		//methods-setter and getter
	public	void setStudent(int id,String name, double avg) {
//local variables-stack area
			sid=id;
			sname=name;
			CGPA=avg;	
		}
	public void getStudent() {
	System.out.println(sid+" "+sname+" "+CGPA+" "+clg+" ");
	}
		
	
}

//heap-objects

//class area /method area

//stack area 
