package udemyjava;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="King";//1-scp
		str.concat("kohli");//appending at the end "king kohli"
		System.out.println(str);//king - strings are immutable
		
		//StringBuffer class -- used to create mutable string
		StringBuffer sb= new StringBuffer("Sachin");
		sb.append("Tendulkar");
		System.out.println(sb);//mutable
		
		// used to manipulate strings. Like StringBuffer, it is a mutable class 
		StringBuilder sb1=new StringBuilder("sourav");
		sb1.append("Ganguly");
		System.out.println(sb1);//mutable
	}

}
