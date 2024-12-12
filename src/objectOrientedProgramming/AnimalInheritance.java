package objectOrientedProgramming;

// Superclass
public class AnimalInheritance
{
    void eat()
    {
        System.out.println("I am eating");
    }
}
    // Subclass
    class Dog extends AnimalInheritance 
    {
        public static void main(String[] args) 
        {
            // Create an instance of Dog
            Dog d = new Dog();

            // Call the inherited method
            d.eat(); // Output: I am eating
        }
    }

