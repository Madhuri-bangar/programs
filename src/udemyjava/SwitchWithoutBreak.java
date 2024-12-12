package udemyjava;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		int marks=1+(int)(Math.random()*100);
		System.out.println(marks);
		marks=marks/10;
		switch(marks) {
		case 0:
		case 1:
		case 2:
		case 3:System.out.println("NOt Pass");
		break;
		case 4:
			System.out.println("D GRADE");
			break;
		case 5:
			System.out.println("C GRADE");
			break;
		case 6:
			System.out.println("B GRADE");
			break;
		case 7:
		case 8:System.out.println("A GRADE");
			break;
		case 9:
		case 10:System.out.println("A+ Grade");
		break;
		default:System.out.println("invalid marks");
			
		}
		

	}

}
