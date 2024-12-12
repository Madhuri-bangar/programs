package Array;

public class CalculateAvgMarks {

	public static void main(String[] args) {
		int []marks= {34,56,78,90,34};
		int sum=0;
		int avg=0;
		
		for(int mark:marks) {
			sum=sum+mark;
			
		}

System.out.println("the average marks from array:"+sum/marks.length);
	}

}
