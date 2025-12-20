/*
- Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its parent class.
- The overridden method must have:
    Same method name
    Same parameter list
    Same return type (or covariant type)
- Method signature must match exactly
- Access modifier: Cannot be more restrictive than the parent’s method.
                   Can be less restrictive.
- Cannot override: 
       static methods
       final methods
       private methods (they are not inherited)
- If a method is declared with the final modifier, it cannot be overridden
- Use @Override annotation to avoid mistakes
- Binding of overridden methods happens at runtime which is known
  as dynamic binding.
- Runtime Polymorphism — method call is resolved at runtime based on the object type.
 */

// parent class
public class methodOverriding {
    // method to override
    void display() {
        System.out.println("I love Programming Languages.");
    }

    public static void main(String[] args) {
        // parent reference , parent object
        methodOverriding m1 = new methodOverriding();
        m1.display();

        // parent reference, child object(runtime polymorphism/dynamic binding)
        methodOverriding m2 = new childClass();
        m2.display();
    }
}

// child class
class childClass extends methodOverriding {
    @Override
    void display() {
        System.out.println("I love Java Language.");
    }
}

/*
 * Compile-time: The compiler checks method signatures.
 * Runtime: JVM decides which method to call based on the
 * actual object type, not the reference type
 */