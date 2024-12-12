package Array;

public class CalculateAge {

	public static void main(String[] args) {
     int ages[]= {90,56,76,34,12,45}; 
     
     float sum=0;
    	float avg=0;
     
     int length=ages.length;
     
     for(int age:ages) {
    	 sum +=age;
     }
    avg=sum/length;
    System.out.println("the average age is:"+avg);
    	

	}

}
