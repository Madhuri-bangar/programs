package objectOrientedProgramming;

public class OverloadingCase5 {

	void show(int a) {
		System.out.println("int  method");
	}
	void show(int...a) {
		System.out.println("varargs  method");
	}
	public static void main(String[] args) {
		OverloadingCase5 t=new OverloadingCase5();
		t.show(10);
		t.show(10,45,489621,41);
		t.show();
	}

}
