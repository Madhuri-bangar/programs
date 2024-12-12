package objectOrientedProgramming;

public class OverloadingCase2 {
	void show(Object a)
	{
		System.out.println("object method");
	}
void show(String a) {
	System.out.println("string method");
}
	public static void main(String[] args) {
		OverloadingCase2  t=new OverloadingCase2 ();
		t.show('a');
		t.show("abc");
	}

}
