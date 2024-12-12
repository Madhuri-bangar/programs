package objectOrientedProgramming;

public class TestPoly
{
	void show(int a,String b) 
	{
		System.out.println("1");
	}
	void show(String a,int b) 
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		
		TestPoly t=new TestPoly();
		t.show("abc",1);
	}

}
