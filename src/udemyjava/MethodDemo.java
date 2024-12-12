package udemyjava;

public class MethodDemo {

	static int add(int x, int y) //formal parameters
	{
		int sum=0;
		for (int i=x;i<=y;i++)
			sum=sum+i;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) //starting
	{
	int s=	add(1,10);//method call--actual parameters
	System.out.println(s);
	System.out.println(add(21,35));
	System.out.println(add(51,75));
	System.out.println(add(101,1111));
	
		
		
		
		/*
// add 1-10 numbers
		int sum1=0;
		for(int i=1;i<=10;i++)
			sum1=sum1+i;
		System.out.println(sum1);
		
		//add21-35 numbers
		int sum2=0;
		for(int i=21; i<=35;i++)
			sum2=sum2+i;
		System.out.println(sum2);
		
		//add 51 to 75 numbers
		int sum3=0;
				for(int i=51;i<=75;i++)
					sum3=sum3+i;
				System.out.println(sum3);
				//add  101 to  1111 numbers
				int sum4=0;
						for(int i=101;i<=1111;i++)
							sum4=sum4+i;
						System.out.println(sum4);
	}
*/
}
}