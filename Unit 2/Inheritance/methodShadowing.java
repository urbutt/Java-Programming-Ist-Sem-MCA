/*
- In Java, method shadowing happens when a static method in a subclass has
  the same name and parameter list as a static method in its superclass.
- Unlike method overriding (which works with instance methods and is
  resolved at runtime), method shadowing is resolved at compile time
  based on the reference type — not the object type.
- This is an example of early binding, happens at compile time.
- Even though you did not write ClassName.method(), the compiler
  treats it as if you did because the method is static
*/

class Parent {
    static void display() {
        System.out.println("Static method in parent.");
    }
}

class Child extends Parent {
    // This shadows Parent's display()
    static void display() {
        System.out.println("Static method in child.");
    }
}

public class methodShadowing {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        // This Will show the static method in Parent
        // (resolved by reference type)
        Parent pc = new Child();
        pc.display();

        Child c = new Child();
        c.display();
    }
}
