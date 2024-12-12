package objectOrientedProgramming;
//object and class
public class Animal {
	
		
		public void run() {
			System.out.println("i am running ");
		}
		public void eat() //method 
		{
			System.out.println("i am eating");
		}	

		//inner class
		class Birds
		{
			void fly()
			{
				System.out.println("i am flying");
			}
			
		}
public static void main(String[] args)
{//main method
	
	System.out.println("1");
	//create object
	Animal cow=new Animal();
	cow.eat();
	cow.run();
	
	Birds sp=cow.new Birds();
	sp.fly();
	
	//Animal aa=new Animal();
	//aa.run();
}





}