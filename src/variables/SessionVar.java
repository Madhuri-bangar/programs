package variables;

//example for class scpoe static variable and method scope
//static variables are created only once and every time call method
public class SessionVar {
	static int a=10;  //class scope
	
	void fun() {
		int b=20;
		System.out.println(a+""+ b);
		++a;
		++b;
	
	}

//method scope
	public static void main(String[] args) {
		//System.out.println(a+""+ b);
		SessionVar r= new SessionVar();
		r.fun();
		
	}

}
