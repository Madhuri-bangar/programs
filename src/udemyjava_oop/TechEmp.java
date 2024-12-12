package udemyjava_oop;

public class TechEmp extends Emp_inherit {
	int bonus;
	//all non pvt of EMp
	//This class extends Emp_inherit, inheriting its properties and methods.
	//setEmp(...)
	
	//idf parent class have constructor then child class aslo have constructor
	//inherited members -non private
	//child specific members
	
	public TechEmp(int eid,String ename,double basic,int bonus) {
		super(eid,ename,basic); //invokes parents constructor-1st statement
		this.bonus=bonus;
	}
	
	
	/*
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	
	public void getBonus() {
		System.out.println("Bonus:"+bonus);
	}
	*/
	//re-define disp()
	@Override
	public void disp() {
		//super
		super.disp();//parent's disp()
		System.out.println(bonus);
	}
	
	@Override //annotations
	//redefining =overriding
public void calSalary() { //method signature must be same
		
		//local variables
		int da=34;
		int hra=30;
		int ta=8;
		
		double salary=getBasic()+getBasic()*(34+30+8)/100+bonus;//updated salary 
		System.out.println("total salary:"+salary);
	}
	/*
	public static void main(String[] args) {
		TechEmp te=new TechEmp();//eid,ename,basic

	//public TechEmp(){super();}
		 // Setting employee details through inherited method
		te.setEmp_inherit(321," madhu", 50000);
		te.setBonus(1000);
		te.disp();
		te.getBonus();
		te.calSalary();//ploymorphism
	}
	*/
	public static void main(String[] args) {
		TechEmp te=new TechEmp(1234,"Srushti",10000,10000);//upcasting
		te.disp();//overriden -RTP
		te.calSalary();
		System.out.println("******************");
		TechEmp e=new TechEmp(321,"abc",1000.00,1000);//
		e.disp();//static binding-parents
		e.calSalary();
		System.out.println("*********************");
		TechEmp te1=new TechEmp(1234,"xyz",10000,10000);//not upcasting
		te1.disp();//static polymorphism
		te1.calSalary();
		System.out.println("********************");
		e=te1;//emp object-e   //techemp object -te
		//upcasting
		
		e.disp();//RTP childs
		e.calSalary();//RTP childs
		
	}
	}

