package udemyjava;

import java.io.Serializable;

public class Person implements Serializable {

	//serializable
	
	private String name;
	private int age;
	transient private long aadhar;// protect sensitive information --not to serialize 
	
	public Person(String name, int age,long aadhar) {
		this.name=name;
		this.age=age;
		this.aadhar=aadhar;
	}
	@Override
	public String toString() {
		return "[Student:-Name:"+name+"Age:" +age+"Aadhar:"+aadhar+"]";
	}
}
