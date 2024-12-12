package udemyjava;

// Abstract class
public abstract class PersonAnomous {
    // Abstract method - needs to be implemented by any subclass or anonymous class
    abstract void eat();
    
    // Concrete method - can be used as is or overridden
    public void speak() {
        System.out.println("english");
    }
    
    public static void main(String[] args) {
        // Anonymous class creation - this is a combination of instantiating the abstract class
        // and providing an implementation for the abstract method 'eat' as well as overriding the 'speak' method
        PersonAnomous p = new PersonAnomous() {
            // Providing implementation for the abstract 'eat' method
            void eat() {
                System.out.println("eating fruit");
            }
            
            // Overriding the 'speak' method
            @Override
            public void speak() {
                System.out.println("speaks hindi");
            }
        };
        
        // Calling the 'eat' method of the anonymous class
        p.eat();
        
        // Calling the overridden 'speak' method of the anonymous class
        p.speak();
    }
}
