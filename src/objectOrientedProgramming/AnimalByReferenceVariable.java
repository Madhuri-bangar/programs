package objectOrientedProgramming;
//initailize object value by using reference variable
public class AnimalByReferenceVariable
{
	String color;
	int age;
    public static void main(String[] args) 
    {
        
    	AnimalByReferenceVariable cow =new AnimalByReferenceVariable();
    	cow.color="black";
    	cow.age=10;
    	
    	System.out.println(cow.color+" "+cow.age);
    }
}