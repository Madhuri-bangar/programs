package udemyjava;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x= 10;         //11  //12
		int res=x++ + ++x;
		System.out.println(x);//12
		System.out.println(res);//12
		
		
		System.out.println(x++ + ++x); //10+12
		//x=12             
		System.out.println(x-- + --x);//12+10
		//x=10
		System.out.println(x++ + --x);//10+10
		//x=10
		System.out.println(x-- + --x);//9+8
		
	System.out.println("-----------------------");	
		int a=10;
		
		int b=++a;
	}

}
