/*
Access Control : controls the access to a variable, method or class etc
    Access Modifiers :  Includes public, private, default and protected
            Public : The code is accessible for all classes
            Private :The code is only accessible within the declared class
            Default : The code is only accessible in the same package. This is used when you don't specify a modifier. 
            Protected:The code is accessible in the same package and subclasses. 

    Non Access modifiers : Includes static,final, abstract etc, do not control access but provide other functionality
            Final: cannot modify existing attribute values
            Static : Its a method, belongs to class, can be executed without creating object
                     cannot use variables or methods that belong to an object.
*/
class Person {
    public String name = "Umar";
    // private int id = 5; // only accessible inside this class
    protected int salary = 3000; // visible to subclasses and same package
    int age = 30; // default (package-private)
    final int birthYear = 2000; // cannot reassign value
}

class Student extends Person {
    public void display() {
        System.out.println("Salary (protected) : " + salary);
    }
}

public class AccessControl {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name : " + p.name);

        // System.out.println("ID : " + p.id); cannot access private variable

        System.out.println("Age : " + p.age);
        System.out.println("Birth Year : " + p.birthYear);
        // p.birthYear = 2004;// cannot reassign value to a final variable

    }
}
