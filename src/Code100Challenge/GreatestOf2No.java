package Code100Challenge;
//Java Program to Find Greatest of Two Numbers
//Method 1: Using if-else Statements
public class GreatestOf2No {

	public static void main(String[] args) {
int n1=50;
int n2=20;
if(n1>n2) {
	System.out.println(n1+ "is greater");
}
else if(n1==n2) {
	System.out.println("both same");
}else {
	System.out.println(n2+"is greater");
}
	}

}

/*
 * Method 2: Using Ternary Operator
 psvm(String[] args){
 int n1=40,ni2=54,temp;
 
 if(n1==n2){
 SOp("both equal")}
 else{
 temp=n1>n2?n1:n2;
 sop(temp+"is grater")
 }
 }
 */
