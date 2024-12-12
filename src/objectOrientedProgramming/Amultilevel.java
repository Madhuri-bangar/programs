package objectOrientedProgramming;

public class Amultilevel {
    void showAmultilevel() {
        System.out.println("a class method");
    }

    // Inner class B
    class B extends Amultilevel {
        void showB() {
            System.out.println("b class method");
        }

        // Inner class C
        class C extends B {
            void showC() {
                System.out.println("c class method");
            }

            // Main method in class C
            public static void main(String[] args) {
                // Create instance of outer class Amultilevel
                Amultilevel ob1= new Amultilevel();
                ob1.showAmultilevel();
                System.out.println("------------------");
                // Create instance of inner class B
                B ob2 = ob1.new B();
                ob2.showAmultilevel();
                ob2.showB();

                // Create instance of inner class C
                System.out.println("----------------------");
                C ob3 = ob2.new C();
                ob3.showAmultilevel();
                ob3.showB();
                ob3.showC();
            }
        }
    }
}
