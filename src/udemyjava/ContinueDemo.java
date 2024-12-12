package udemyjava;

public class ContinueDemo {

	/*
	public static void main(String[] args) {
	
		for(int i=1;i<=50;i++)
		{
			//skip number 26 to 40
			if(i>25 && i<=40)
				continue; //skip loop body
			
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
*/
	
	//continue demo print A-Za-z using a single loop
	public static void main(String[] args) {
		
		for(int i=65;i<=122;i++) {
			if(i>90 && i<97)
				continue;
			System.out.println((char)i+" ");//skipped for i>90 and i<97
			
		}
	}
}