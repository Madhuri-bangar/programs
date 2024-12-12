package udemyjava;

public class PrimeNo {

	public static void main(String[] args) {
int number=2 +(int) (Math.random()*99);
//prime number=2 factors only
int i=1;
int count=0;
while(i<=number/2) {
	if(number %i==0) {//true factor
		count++;//keeping the count
		
		if(count>1) 
			break;
	}
	i++;
}
if(count==1)
	System.out.println(number + " is a prime number");
else
System.out.println(number + " is not a prime number");
	
	
	}

}
