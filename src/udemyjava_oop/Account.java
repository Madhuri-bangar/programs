package udemyjava_oop;
//Inheritance
public class Account {
//has a relationship between customer and account
	private int accNo;
	private String accType;
	private double accBalance;
	
	//aggregation
	//constuctor
	public Account(int accNo,String accType,double accBalance) {
		this.accNo=accNo;
		this.accType=accType;
		this.accBalance=accBalance;
		
	}
	//getter
	public void getAccount() {
		System.out.println(accNo+" "+accType+" "+accBalance);
	}
}
//run thrugh customer_main