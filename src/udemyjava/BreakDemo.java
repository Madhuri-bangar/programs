package udemyjava;

public class BreakDemo {

	public static void main(String[] args) {

		for(int i=5;i<=100;i=i+5) {// 5 10 15 20...50
			System.out.println(i+" ");
			
			if(i>=50)
				break;//jump from loop block
		}
			
		System.out.println();
		}
		
	}
				


