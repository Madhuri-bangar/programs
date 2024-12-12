package objectOrientedProgramming;
//single inheritance
public class A
{
void showA()
{
	System.out.println("a class method");
	
}
}
class B extends A
{
	void showB() {
		System.out.println("b class method");
	}
	public static void main(String []Args) {
		A ob1=new A();
		ob1.showA();
		//ob1.showB();
		
		B ob2=new B();
		ob2.showB();
		ob2.showA();
	}
}
