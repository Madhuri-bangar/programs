package udemyjava_oop;

public interface XYZ {
    void absMethod(); // abstract

    // Default method
    default void msg() {
        System.out.println("its a default method");
        PvtMethod(); // Private method can be called within the interface
    }

    // Static method
    static void fun() {
        System.out.println("its a static method");
    }

    // Private method (new in Java 9)
    private void PvtMethod() {
        System.out.println("its a private method");
    }

    // Static private method (new in Java 9)
    private static void stPvtMethod() {
        System.out.println("its a static private method");
        // Removed recursive call to avoid infinite recursion
    }

    // Nested class implementing the XYZ interface
    public class ABC implements XYZ {
        public void absMethod() {
            System.out.println("method of XYZ implemented in ABC");
        }

        public static void main(String[] args) {
            XYZ.fun(); // Calling static method from the interface
            ABC abc = new ABC(); // Creating an instance of the ABC class
            abc.msg(); // Calling the default method
       abc.absMethod();
        }
    }
}
