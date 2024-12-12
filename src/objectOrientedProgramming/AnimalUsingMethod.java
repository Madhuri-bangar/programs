package objectOrientedProgramming;
//initailize object value by using method 
public class AnimalUsingMethod 

	{
		String color;
		int age;
		void initObj(String c,int a)//initialize value of local variable
		{
			color=c;
			age=a;
		}
		
		void display() {
			System.out.println(color+" "+age);
		}
		
	    public static void main(String[] args) 
	    {
	        
	    	AnimalUsingMethod cow =new AnimalUsingMethod();
	    	cow.initObj("black",10 );
	    	cow.display();
	    	
	    	
	    }
}
