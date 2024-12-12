package udemyjava_oop;



//Abstract method
public abstract class ATM {
	
	double intRate;
	public ATM(double intRate) {
		this.intRate=intRate;
	}
	
abstract void withdraw();
abstract void deposit();

//concrete method
void disp() {
	System.out.println("i am ATM");
}
}
