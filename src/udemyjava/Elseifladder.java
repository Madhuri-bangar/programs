package udemyjava;

public class Elseifladder {

	public static void main(String[] args) {

		int marks=1+(int)(Math.random()*100);//1-100
		System.out.println("marks:"+marks);
		
		if(marks>=85)
			System.out.println("grade:A+")
			;
		else if(marks>=70)
			System.out.println("Grade:A");
		else if(marks>=60)
			System.out.println("Grade:B");
		else if(marks>=50)
			System.out.println("Grade:C");
		else if(marks>=40)
			System.out.println("Grade:D");
		else
			System.out.println("Not Pass");
		

	}

}
