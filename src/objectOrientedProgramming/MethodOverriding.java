package objectOrientedProgramming;

public class MethodOverriding 
{
    // Overloaded method with String and int parameters
    void show(String a, int b) {	
        System.out.println("Parent class show method - String: " + a + ", int: " + b);
    }
}

class Xyz extends MethodOverriding
{
    // Overloaded method with a single int parameter
    void show(int a) {
        System.out.println("Child class show method - int: " + a);
    }
    
    public static void main(String[] args) {
        MethodOverriding t = new MethodOverriding();
        t.show("abc", 2); // Calls the method from MethodOverriding class
        
        Xyz x = new Xyz();
        x.show(2); // Calls the overloaded method from Xyz class
    }
}
