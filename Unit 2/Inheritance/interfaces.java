/*
- Another way to achieve abstraction in Java, is with interfaces.
- An interface is a completely "abstract class" that is used to group
  related methods with empty bodies.
- To access the interface methods, the interface must be "implemented"
  (kinda like inherited) by another class with the implements keyword
  (instead of extends). The body of the interface methods is provided by
  the "implement" class.
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)
- Java does not support "multiple inheritance". However, it can be achieved
  with interfaces, because the class can implement multiple interfaces.
*/

//Interface
interface Student {
    // interface methods (does not have a body)
    void setDetails(String name, int age);

    void getDetails();
}

// Implements the 'Student' interface
class StudentDetails implements Student {
    private String name;
    private int age;

    // Implementing the interface methods
    @Override
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getDetails() {
        System.out.println("Student Details : ");
        System.out.println("Name : " + name + "\nAge : " + age);
    }
}

public class interfaces {
    public static void main(String[] args) {

        // create an instance of subclass
        Student s = new StudentDetails();

        // set student details
        s.setDetails("Umar", 25);

        // get student details
        s.getDetails();
    }
}
