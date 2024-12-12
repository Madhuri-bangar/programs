package telusko;

public class logical {

	public static void main(String[] args) {
		int x=5;
		int y=7;
		int a=4;
		int b =9;
		//and , or logical operator 
		//boolean result =x>y && a<b;
		boolean result1=x<y || a<b;
		System.out.println(result1);
		
		//not operator
		boolean result2=a>b;
		System.out.println(!result2);
	}

}
