package Array;

public class integerPresentOrNot {

	public static void main(String[] args) {
		int [] marks= {45,76,2,3,87,45};
		int num=3;
		boolean isInArray=false;
		for(int element:marks) {
			if(num==element) {
				isInArray=true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("the value is present in the array");
		}else
		{
			System.out.println("the value is not  present in the array");

		}
			
		}
		

	

}
