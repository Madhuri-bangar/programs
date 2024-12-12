package udemyjava;

public class ArrayInit {

	public static void main(String[] args) {
//array initilization
		int[] marks= {4,6,7,8,34,76,87,23,7};//9
		
		System.out.println(marks.length);//size
		
		//printing arr element
		for(int i=0;i<marks.length;i++)
			System.out.println(marks[i]);
		
		//read  data to array using Math.random()
		double[] randomNumbers=new double[10];
		for(int i=0;i<randomNumbers.length;i++) {
			randomNumbers[i]=Math.random();//0.0-0.99k
		}
		for(double d:randomNumbers)
			System.out.println(d);
		
		String[]cities= {"pune","hyd","blr","del","mum","chen"};//6
		
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//print all cities-for each
		for(String city:cities)
			System.out.println(city);
	}

}
