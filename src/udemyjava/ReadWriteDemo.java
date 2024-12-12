package udemyjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new FileReader("ReadWriteDemo.java")); //to read same .java file
	//FileWriter fw=new FileWriter("abc.txt");
BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
	/*int x,count=0;
	while((x=fr.read()) !=-1){
		fw.write(x);//write(int)
		System.out.println((char)x);
	}*/
int lcount=0;
String line;
//EOF-readLine()-->null
// Read each line until the end of the file (EOF)
while((line=br.readLine())!= null){
	bw.write(line);
	lcount++;
}
bw.write("\n Number of lines in the file::"+lcount);
	System.out.println("\nfile read and successfully written to abc.txt file");
	br.close();
	bw.close();
	
	}

}
