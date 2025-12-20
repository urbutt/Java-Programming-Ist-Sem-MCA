/*
A class is a blueprint for creating objects.
It encapsulates data (variables) and behavior (methods).
Its created using the 'class' keyword
*/

public class MyClass {
    // Variable Declaration
    private String name; // instance variable, used by objects
    private int age;
    private static String species = "Human"; // class variable , stays same across objects

    // Constructor Declaration using same name as class 
    // initializes objects ,executes when an object is called, no return type
    MyClass(String name, int age) {
        // using 'this' keyword to distinguish instance variables from parameters
        // refers to the current object
        this.name = name;
        this.age = age;
    }

    // Method Declaration
    public void display() {
        System.out.println(name + " is a " + age + " year old " + species + ".");
    }

    // main method which java access first
    public static void main(String[] args) {
        // creating object
        MyClass obj = new MyClass("Waseem", 25); // passes parameters to constructor
        obj.display(); // calls method
    }
}
