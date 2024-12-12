package udemyjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1=new Person("ASDF",21,12234566L);
		System.out.println(p1); //p1.toString

		
		//serialization
		FileOutputStream fos=new FileOutputStream("person.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p1); //serialization
		
		//de-serialization
		FileInputStream fis=new FileInputStream("person.dat");
		ObjectInputStream ois =new 	ObjectInputStream(fis);
		Person p2= (Person) ois.readObject();//return java.lang.Object
		
		//print object
		System.out.println(p2);
		
	}

}
