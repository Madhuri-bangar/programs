package variables;

public class typecating {
	public static void main(String[] args) {
		//smaller data types --> larger data type==widening or implicit type casting
				int a=10;  //4 byte
		double b=a;        // 8 byte 
		System.out.println(b);
		
		
		//explicit type casting
		//larger datatype--> smaller data type==narrowing oe explicit type cating
		
		double x=10.45678; // 8 byte
		int y=(int)x;   //4 byte
		System.out.println(y);
	}

}