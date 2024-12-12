package udemyjava_oop;
interface Printable1{
	void print();
}

interface Showable1{
	void show();
}
public class MultipleInheritance implements Printable,Showable{
	public void print() {
		System.out.println("its printing");
	}
	
	public void show() {
		System.out.println("its showing");
	}
	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.print();
		mi.show();
	}


}
