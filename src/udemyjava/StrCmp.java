package udemyjava;

public class StrCmp {

	public static void main(String[] args) {
		
		String s1="Sachin";//SCP
		String s2="Virat";//SCP
		String s3=new String("Sachin");//heap-1
		String s4=new String("virat");//heap-1
		
		String s5="sachin";//SCP
		String s6=new String("Rohit");//heap-1,scp-1
		String s7="Sachin"; //no object in SCP-already exists
		//boolean
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equalsIgnoreCase(s5));//true
		System.out.println(s1.equals(s2));//false
	//int
	System.out.println(s1.compareTo(s5));//-32
	System.out.println(s5.compareTo(s1));//32
	System.out.println(s2.compareTo(s4));//0
	
	System.out.println(s3.compareTo(s6));//1
	System.out.println(s1.compareToIgnoreCase(s5));//0
	
	
	//== operator
	System.out.println(s1==s3);//false
	System.out.println(s2==s4);//false
	System.out.println(s1==s7);//true
	
	}

}
