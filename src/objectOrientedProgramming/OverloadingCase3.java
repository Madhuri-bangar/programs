package objectOrientedProgramming;

public class OverloadingCase3 {

	void show(StringBuffer a) {
		System.out.println("stringbuffer method");
	}
	void show(String a) {
		System.out.println("string method");
	}
	public static void main(String[] args) {
		OverloadingCase3  t=new OverloadingCase3 ();
		t.show("abc");
		t.show(new StringBuffer("xyz"));
		

	}

}
