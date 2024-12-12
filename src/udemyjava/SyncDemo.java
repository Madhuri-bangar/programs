package udemyjava;

public class SyncDemo {

	public static void main(String[] args) {
		Display d = new Display();
		// anonymous inner classes
		Thread t1 = new Thread() {
			public void run() {
				d.printCapitals();
			}
		};
		t1.start();// print A_Z

		Thread t2 = new Thread() {
			public void run() {
				d.printsmaller();
			}

		};
		t2.start();
	}
}
