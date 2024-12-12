package udemyjava_oop;
//abstract class
public class Bank extends ATM {
	int cashback;//child specific intRate from parent
	
	public Bank(double intRate,int cashback) {
		super(intRate);
		this.cashback=cashback;
		
	}

	void withdraw() {
		System.out.println("withdraw success");
	System.out.println("congrats...you got cashback..."+cashback);
	}

	void deposit() {
		System.out.println("deposit success");
		System.out.println("congrats...you got interest @"+intRate);
	}

	@Override
	void disp() {
		super.disp();//call parent class
		System.out.println("i am bank");
	}
	
	void fun() {
		System.out.println("its child specific method");
	}

	public static void main(String[] args) {
		ATM a1 = new Bank(8.5,30);// upcasting
		a1.withdraw();
		a1.deposit();
		a1.disp();
		Bank b1=new Bank(8.5,30);
		b1.fun();//child specific method
		
	}
}
