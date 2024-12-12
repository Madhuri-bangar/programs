package udemyjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		
int a=4; //0 1 0 0
int b=3; //0 0 1 1
      //----------
//   &     0 0 0 0  //0

//   |    0 1 1 1 //7

//  ^    0 1 1 1   //7

//  ~  -(a+1)  //-5
System.out.println(a&b);//0
System.out.println(a|b);//7
System.out.println(a^b);//7
System.out.println(~a);//-5


/*
 <<  left shift doubles the number
 a=4=0100
 
 00100000
 
 a*2 pow n
 
 >> right shift 
 >>1; //16
 
 a=4=0100
 
 00000100
 
 >>> unsigned right shift /right shift with zero fill
 */
	}

}
