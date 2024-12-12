package telusko;

public class Loops {

	public static void main(String[] args) {
		// while loop
		int i = 1;// irrarator

		while (i<=4) {
			System.out.println("Hi "+  i);
			int j=1;
				while(j<=3) {
				System.out.println("HEllo "+j);
				j++;
			}
				i++;
		}
		System.out.println("bye "+i);
	}

}
