
public class TernaryOperator {

	public static void main(String[] args)  throws Exception{
	int a=1+(int)(Math.random()*100);//1-100
	int b=1+(int)(Math.random()*100); //Math.random() generates a random decimal number o
	int c=1+(int)(Math.random()*100);
	
	
	System.out.println(a+" "+b+" "+c);
	
int biggest=(a>b && a>c) ? a:(b>c ? b:c);//find biggest of 3 
System.out.println(biggest);
	}

}
