package udemyjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader ("src/udemyjava/RWDemo.java"));
		BufferedWriter bw=new BufferedWriter (new FileWriter("abc.txt"));
		int lcount=0;
		
		String line;
		while ((line =br.readLine()) != null) {
			bw.write(line);
			bw.write("\n");
			System.out.println(line);
			lcount++;
			
		}
		
bw.write("no of lines in the file:"+lcount);
System.out.println("file read and successfully written to abc.txt file");

br.close();
bw.close();
	}

}
