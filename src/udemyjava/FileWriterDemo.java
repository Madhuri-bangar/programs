package udemyjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

//File f =new File("first.txt");
//FileWriter fw=new FileWriter("first.txt",true);//appending -true
//BufferedWriter bw=new BufferedWriter(fw);

//anonymous objects
		BufferedWriter bw = new BufferedWriter(new FileWriter("first.txt", true));

		bw.write("java is an OOP\n");
		bw.write("java is secure and dyanamic\n java is distributed and robust");
		bw.close();
		System.out.println("file written successfully...");
	}

}
