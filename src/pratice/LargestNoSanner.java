package pratice;

import java.util.Scanner;

public class LargestNoSanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1:");
		int a = sc.nextInt();

		System.out.println("Enter num 2:");
		int b = sc.nextInt();

		System.out.println("Enter num 3:");
		int c = sc.nextInt();

		int largest;
		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("largest number is:" + largest);
		sc.close();

	}

}
