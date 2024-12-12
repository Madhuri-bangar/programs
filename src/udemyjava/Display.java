package udemyjava;

public class Display {

	// print A_Z
	public synchronized void printCapitals() {
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + "");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}

	// to print a-z
	public  synchronized void printsmaller() {
			for(int i=97;i<=122;i++) {
			System.out.print((char)i+"");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.print(e);
			}
	}
}
}
