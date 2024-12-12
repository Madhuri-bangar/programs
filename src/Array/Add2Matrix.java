package Array;

public class Add2Matrix {

	public static void main(String[] args) {
		int mat1[][]= {{1,3,2,},
					   {3,5,4}};
		
		int mat2[][]={{11,31,21,},
				    {31,51,41}};
		
		int result [][]= {{0,0,0},
						{0,0,0}};
		
		for (int i=0;i<mat1.length;i++) {//row number of times=2
			for(int j=0;j<mat2[i].length;j++) {//column number of time=3
				System.out.format("setting value for i=%d and j=%d\n",i,j);
				
				result[i][j]=mat1[i][j]+mat2[i][j];
				
			}
		}
		for (int i=0;i<mat1.length;i++) {//row number of times=2
			for(int j=0;j<mat2[i].length;j++) {//column number of time=3
				System.out.println(result[i][j]+" ");
				
				result[i][j]=mat1[i][j]+mat2[i][j];

	}
System.out.println("");
}
}
}