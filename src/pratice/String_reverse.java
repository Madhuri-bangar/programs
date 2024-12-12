package pratice;

public class String_reverse {

	public static void main(String[] args) {
		//Reverse a String Without Using Built-in Methods
		
		String str="Ram";
		String reversed="";
		for(int i =str.length()-1;i>=0;i--) {// starts with the last char decrement until it reaches the 1st char
			reversed+=str.charAt(i);
	}

	System.out.println("reverse string :"+reversed);	
	}


}
