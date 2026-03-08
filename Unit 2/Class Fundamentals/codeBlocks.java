/*
  Static Block :
     Declared with static { ... }.
     Executes only once when the class is loaded into memory (before main() runs).
     Used for static initialization (e.g., loading configuration, initializing static variables),
     or performing setup tasks that need to be executed once per class load.
  Non-Static (Instance) Block :
     Declared with { ... } (no static keyword).
     Executes every time an object is created, before the constructor.
     Used for common initialization code for all constructors.
  Order of Execution:
     1. Static block (once, when class is loaded)
     2. Instance block (per object creation)
     3. Constructor (per object creation)
*/

public class codeBlocks {
    // static variable
    static int staticValue;

    // instance variable
    int instanceValue;

    // Static block - runs only once when the class is loaded
    static {
        staticValue = 100;
        System.out.println("Static block executed , staticValue initialized to " + staticValue);
    }

    // Non-static (instance) block - runs every time an object is created
    {
        instanceValue = 10;
        System.out.println("Instance block executed , instanceValue initialized to " + instanceValue);
    }

    // Constructor
    codeBlocks() {
        System.out.println("Constructor executed");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Main method started");

        // First object created
        System.out.println("\nCreating first object");
        codeBlocks c1 = new codeBlocks();

        // First object created
        System.out.println("\nCreating second object");
        codeBlocks c2 = new codeBlocks();
    }
}
