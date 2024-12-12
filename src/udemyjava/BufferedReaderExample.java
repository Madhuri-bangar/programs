package udemyjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		
	//FileReader fr=new FileReader("first.txt");
	//read() -reads a char and return int
	//EOF- -1
	//wrapping anonymous object
	BufferedReader br=new BufferedReader (new FileReader("first.txt"));
	int x,count=0;
	
	while((x=br.read()) !=-1) {
		System.out.print((char)x); //int to char -explicitly type casted
		count ++; //ciunt of chars
	}
	System.out.println();
	System.out.println("No of chars in the file:"+count);
	
	br.close();
	}

}
