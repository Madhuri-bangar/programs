package objectOrientedProgramming;
//method overloading case 1

public class OverloadingCase1 {
void show(int a) {
	System.out.println("int method");
}
void show(String a) {
	System.out.println("String method");
}
public static void main(String[] args) {
	OverloadingCase1 t=new OverloadingCase1();
	t.show(20);
	t.show("abc");
	t.show('a');//automatic promotion
}
}
