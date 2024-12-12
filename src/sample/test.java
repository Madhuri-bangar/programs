package sample;

class demo {
    String name = "person1";
    int age = 21;

    void show() {
        System.out.println("the name is " + name + " " + age);
    }
}

public class test {
    public static void main(String[] args) {
        demo d1 = new demo(); // Create an instance of the demo class
        d1.show();            // Call the show() method on the demo instance
    }
}
