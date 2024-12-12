//print 1st 10 number using while and 10 to 1
package udemyjava;

public class WhileLoop {

	public static void main(String[] args) {
int i=1; //init

while(i<=10) { //test condition
	System.out.println(i);
i++;// update statement	
}
System.out.println("************");
int x=10; //init
do {
	System.out.println(x);
	x--; //update
}while(x>=1);//test conditon

	}
}
