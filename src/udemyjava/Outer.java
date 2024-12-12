package udemyjava;
//nested class
public class Outer {//public ,final,abstract,strctfp
/*class Inner{
	//
}
static class Nested{
	
}
*/
	//inner classes
	
	/*
	//1 member class
	class A{
		
	}
	//2local
	void disp() {
		class B{
			
		}
	}
	//3 Anonymous inner class - local class
	
	void fun() {
		new <SuperType>()
		
		{
			//class definintion
		}
	}
	*/
	
	
	private int data=99;
	
	class Inner{
		void msg() {
			System.out.println("Data of outer class is:"+data);
			
			Inner in=new Inner();//in-exist in out object
			in.msg();
		}
	}
	void disp() {
		System.out.println("i am outer class method");
	}
	public static void main(String[] args) {
		Outer out=new Outer();//outer object
		
		//Outer.Inner in=out.new Inner();
		//in.msg();
		
		out.disp();
	}
}
