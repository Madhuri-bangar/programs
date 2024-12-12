package variables;

public class TypesVariable {
	int b=20; // instance variable
	
	static int c =30;   //static variable
	

	public static void main(String[] args) {
		//type of variables local,instance,static
		//local variable
		int a=10;
		System.out.println(a);
		//to call var an instance var create an instance of class
		TypesVariable b1=new TypesVariable();
		System.out.println(b1.b);
		
		//to call static var to call with the class 
		System.out.println(TypesVariable.c);
		//all 3 together
		System.out.println(a+b1.b+TypesVariable.c);

	}

}
