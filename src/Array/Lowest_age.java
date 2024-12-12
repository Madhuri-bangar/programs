package Array;

public class Lowest_age {

	public static void main(String[] args) {
		//Declare and initialize the array of ages
		int ages[]= {34,56,78,12,34,98,56};
		float sum=0;
		float avg=0;
		
		int length=ages.length;
		
		int lowestage=ages[0];
		
		for(int age:ages) {
			if(lowestage>age) {
				lowestage=age;
				
			}
		}
		System.out.println("the lowestage is:"+lowestage);

}
}
