package udemyjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//FileReader fr = new FileReader("first.txt");
		// read()-reads a char and returns int
		// EoF - -1

		// wrapping anonymous object
		BufferedReader br = new BufferedReader(new FileReader("first.txt"));
		int x, count = 0;
		while ((x = br.read()) != -1) {
			System.out.print((char) x);// int to char-explicitly type casting
			count++;//
		}
		System.out.println();
		System.out.println("no of chars in the file:" + count);
		br.close();
	}

}
