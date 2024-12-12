package objectOrientedProgramming;

public class OverloadingCase4 {

	void show(int a,float b) {
		System.out.println("int float method");
	}
	void show(float a,int b) {
		System.out.println("float int  method");
	}
	public static void main(String[] args) {
		OverloadingCase4  t=new OverloadingCase4 ();
		t.show(10, 20.50f);
		t.show(12.5f,23);
       // t.show(10, 20); error 
		
	}

}
