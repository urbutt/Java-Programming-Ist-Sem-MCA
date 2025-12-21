/*
- Data abstraction is the process of hiding certain details and
  showing only essential information to the user, provides security.
- Abstraction can be achieved with either abstract classes or interfaces
- Abstract classes and interfaces cannot be directly instantiated.
- But we can reference an abstract type using a concrete subclass object.
- The abstract keyword is a non-access modifier, used for classes and methods:
        Abstract class: is a restricted class that cannot be used to
                        create objects (to access it, it must be inherited
                        from another class).
        Abstract method: can only be used in an abstract class, and it
        does not have a body. The body is provided by the subclass (inherited from).
*/

// abstract class
abstract class SecureSystem {
    // Abstract method (does not have a body)
    abstract boolean login(String input);

    // concrete method or regular method
    void access(String input) {
        if (login(input)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}

// subclass
class Login extends SecureSystem {
    @Override
    // the body of the abstract method is provided here
    boolean login(String password) {
        return password.equals("admin");
    }
}

public class abstraction {
    public static void main(String[] args) {
        SecureSystem s = new Login(); // child class object
        s.access("admin");
        s.access("something");
    }
};
