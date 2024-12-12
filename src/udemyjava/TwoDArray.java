package udemyjava;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner  in=new Scanner(System.in);
		//defining arrays of arrays
		int [][] arr=new int [3][4];
		//2 loop require for 2 arr
		//i loop anfd j loop
	
		//initialization
		int[][] x= {{1,2,3},
			     	{4,5,6},
			    	{7,8,9}}; //3*3
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			System.out.println(x[i][j]+" ");
			
			System.out.println(); //newline
		}
		//populating array elements
	System.out.print("please enter items to array(3*4)");
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++)
			arr[i][j]=in.nextInt();
	
	}
	//printing array elemnts-matrix
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++)
		System.out.println(arr[i][j]+" ");
		
		System.out.println(); //newline
}

}
}
