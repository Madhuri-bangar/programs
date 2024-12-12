package Array;

public class flatsSum {

	public static void main(String[] args) {
		float marks[]= {103.5f,102.5f,102.6f,201.3f,202.3f,203.7f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
		}
		System.out.println("the value of sum is: "+sum);
		

	}

}
