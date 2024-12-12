package pratice;

public class Fibonacci {

	public static void main(String[] args) {
		//. Print Fibonacci Series
		int n=100,first=0,second=1;
		
		System.out.println("fibonacci series:"+first+" "+second);
		
		for(int i=2;i<n;i++) {
			int next=first+second;
			System.out.print(","+next);
			first=second;
			second=next;
		}
	}

}
