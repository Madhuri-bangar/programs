package udemyjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];//10*4=40 bytes
        int sum = 0;

        System.out.println("enter " +arr.length+ " elements");
        // Populating array and calculating sum
        for (int i = 0; i < arr.length; i++) {
        //    arr[i] = 1 + (int) (Math.random() * 100); // random number
        	
        	arr[i]=in.nextInt();
            sum += arr[i]; // Add each element to sum
        }

        System.out.println("Sum of arr elements: " + sum);
        System.out.println("Avg of arr elements: " + (sum / arr.length));

        // Printing array
        for (int i : arr) {
            System.out.println(i);
        }

        // Min and max 
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min)
		min=arr[i];
	
	if(arr[i]>max)
		max=arr[i];
}
System.out.println("Min:"+min+" "+"Max: "+max);

//search for element in array

System.out.println("please enter elemen to search");
int x=in.nextInt();

boolean flag=false;

for(int i=0;i<arr.length;i++) {
	if(x==arr[i]) {
		System.out.println(x+" is found at index:"+i);
		
		flag=true;
		break;
	}
}
if(flag==false)
	System.out.println(x+" is not found");
       

//sorting the array elements
Arrays.sort(arr);
for(int i:arr)
	System.out.println(i);
    }

}

