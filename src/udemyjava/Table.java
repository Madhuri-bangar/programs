//printing a math table using for loop
package udemyjava;

public class Table {

	public static void main(String[] args) {
int number=11+(int)(Math.random()*90);

System.out.println(number);
for(int i=1;i<=10;i++)
	System.out.println(number+" *"+i+"="+(number*i));


	}

}
