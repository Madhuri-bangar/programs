package udemyjava;

public class Customer {

	double balance;

	public Customer(double balance) {
		this.balance = balance;
	}

	public void getBalance() {
		System.out.println("balance:" + balance);
	}

	public synchronized void withdraw(double amount) {
		System.out.println("going to withdraw:");
		if (amount > balance) {
			System.out.println("less balance:waiting for deposit");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		balance = balance - amount;
		System.out.println("withdraw completed!");
		getBalance();

	}

	public synchronized void deposit(double amount) {
		System.out.println("going to deposit:");
		balance = balance + amount;
		System.out.println("deposit completed");
		getBalance();
		notify();//
	}
}
