package udemyjava;

public class SwitchCase {

	public static void main(String[] args) {
int dayNo=Integer.parseInt(args[0]);
switch(dayNo) {
case 1:
	System.out.println("Its Monday");
break;
case 2:
	System.out.println("Its Tuesday");
break;
case 3:
	System.out.println("Its Wesnesday");
break;
case 4:
	System.out.println("Its Thursday");
break;
case 5:
	System.out.println("Its Friday");
break;
case 6:
	System.out.println("Its Saturday");
break;
case 7:
	System.out.println("Its sunday");
break;
default:
	System.out.println("please enter 1-7 numbers only");
}
	}

}