package udemyjava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffer_stream {

	public static void main(String[] args)throws Exception {
		
		//FileWriter fw=new FileWriter("first.txt",true);
		//BufferedWriter bw=new BufferedWriter(fw);
		
		
		//anonymous objects value that has been created but has no name
		BufferedWriter bw = new BufferedWriter(new FileWriter("first.txt",true));
		bw.write("java is oop lang");
		bw.write("java is secure");
		
		bw.close();
		System.out.println("file written successfully ");

	}

}
