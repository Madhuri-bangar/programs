package udemyjava;

public class Operator {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);//123
		int y=Integer.parseInt(args[1]);//10
		
		System.out.println(x>y);//true
		System.out.println(x==y);//false
		
		//int x=123;
		//int y=0;
		//exception  
		
		//int res=x/y;//0 -crashes-no rest of the code will execute
		//System.out.println(res);//divide /zero=infinity -->NO
		
		int p=x*y;
		System.out.println(p);
		
		int r=x%y;
		System.out.println(r);

	}

}
