package udemyjava;

public class ITCDemo_customerMain {

	public static void main(String[] args) {
		Customer c1 = new Customer(25000);

		// anonymous inner classes and thread objects

		new Thread() {
			public void run() {
				c1.withdraw(30000);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c1.deposit(25000);
			}
		}.start();
	}

}
