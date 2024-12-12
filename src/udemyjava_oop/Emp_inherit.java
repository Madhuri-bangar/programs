package udemyjava_oop;

//inheritance
public class Emp_inherit {// fully encapsulated

	private int eid;
	private String ename;
	private double basic;// basic salary
	private static String org = "google";// shared across all instances

	public double getBasic() {
		return basic;
		
	}//parameterized constructor
	// Method to set employee details
	public  Emp_inherit(int eid, String ename, double basic) {
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}

	// Method to display employee details
	public void disp() {
		System.out.println(eid + " " + ename + " " + basic + " " + org);
	}

	public void calSalary() { // ploymorphism

		// local variables
		int da = 34;
		int hra = 30;
		int ta = 8;

		double salary = basic + basic * (34 + 30 + 8) / 100;
		System.out.println("total salary:" + salary);
	}

}
