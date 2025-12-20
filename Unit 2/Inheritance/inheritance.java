/*
- Inheritance is an OOP mechanism that allows a class (subclass/child)
  to acquire properties and behaviors (fields and methods) from another
  class (superclass/parent). This promotes code reusability and supports
  polymorphism.
- The keyword 'extends' is used to inherit from the parent class.
- If you don't want other classes to inherit from a class, 
  use the final keyword.
- In child class 'Super' keyword is used to refer to the parent class.
- Java supports only single inheritance, in which each class is
  derived from exactly one direct superclass.
*/

//Parent class
public class inheritance {
    String message = "Hello from parent class";

    void display() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        childClass c = new childClass(); // child class object
        c.display(); // calls parent class method
    }
}

class childClass extends inheritance {
    // This is a child class which now have access to parent class
    // attributes and methods.
}
