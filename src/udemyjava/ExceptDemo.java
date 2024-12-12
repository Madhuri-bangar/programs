package udemyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter name and age");

		String name = null;
		int age = 0;
		try {
			name = br.readLine();
			age = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			//closing resources
			if(br!=null)
				br.close();
			System.out.println("resource closed!");
		}
		System.out.println(name + " " + age);
		System.out.println("rest of the code....");

	}
}
