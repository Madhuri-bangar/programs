package udemyjava;

public class OddNumber {

    public static void main(String[] args) {
        // Print even numbers
        System.out.println("*****even numbers*****");
        for (int i = 0; i <= 50; i += 2) {
            System.out.print(i + " ");
        }

        // Print odd numbers
        System.out.println("\n\n*****odd numbers*****");
        for (int x = 1; x <= 50; x += 2) {
            System.out.print(x + " ");
        }
    }
}
