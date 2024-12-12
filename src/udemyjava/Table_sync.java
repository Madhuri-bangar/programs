package udemyjava;

public class Table_sync {
	public  synchronized void printTable_sync(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class First extends Thread {
		Table_sync t;

		public First(Table_sync t) {
			this.t = t;
		}

		public void run() {
			t.printTable_sync(19);
		}
	}

	class Second extends Thread {
		Table_sync t;

		public Second(Table_sync t) {
			this.t = t;
		}

		public void run() {
			t.printTable_sync(18);
		}
	}

	class Third extends Thread {
		Table_sync t;

		public Third(Table_sync t) {
			this.t = t;
		}

		public void run() {
			t.printTable_sync(17);
		}
	}
}
