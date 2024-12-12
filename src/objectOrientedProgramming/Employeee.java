package objectOrientedProgramming;

public class Employeee 
{
	String name;
	int emp_id;
	
	//use parameterized constructor
	Employeee(String name,int emp_id){
		this.name=name;
		this.emp_id=emp_id;
	}
	public static void main(String []args) 
	{
		Employeee e1=new Employeee("madhu",101);
		Employeee e2=new Employeee("om",102);//initialize object
		
		System.out.println("Employee 1:"+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2:"+e2.name+" "+e2.emp_id);
	}

}
