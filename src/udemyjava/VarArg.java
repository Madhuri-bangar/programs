package udemyjava;

public class VarArg {
static	void add(int... x) {//it allow variable no. of arguments to be passed
		int s=0;
		for(int i=0;i<x.length;i++)
			s+=x[i];
		System.out.println(s);
			
	
	}

	public static void main(String... args) {
		//variable argument
		System.out.println("it works ");
		
		add(10,20); //2 args
		add(10,20,30);//3 args
		add(23,54,65,76,87,1,43,21);

	}

}
