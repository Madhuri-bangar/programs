package udemyjava_oop;
//interfaces
public  class SBI implements RBI{
	public void withdraw() {
		System.out.println("withdraw success");
	}
public void deposit() {
	System.out.println("deposit success and you got interest @"+intRate);
}
public void transfer() {
	System.out.println("transfer success");
	
}
public void disp() {
    System.out.println("I am SBI ");
}
public static void main(String[] args) {
	RBI r1=new SBI();//upcasting
	r1.withdraw();
	r1.deposit();
	r1.transfer();
	
	SBI s1=new SBI();
	s1.disp();
}
}
