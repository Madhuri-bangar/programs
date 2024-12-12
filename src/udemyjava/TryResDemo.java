package udemyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//try with resources
public class TryResDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null; // resource

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name:");
			String name = br.readLine();
			System.out.println("hi " +name);

		} //try end
		catch (IOException e) {
			System.out.println(e);
		} 
		/*finally {
			if (br != null)
				br.close();
			System.out.println("resorce closed");
		}
		*/
		System.out.println("rest of the code follows...");
	}

}
