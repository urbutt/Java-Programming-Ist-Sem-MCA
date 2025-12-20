/*
 * Constructor chaining in Java is the process of calling one
 * constructor from another within the same class or from a parent class.
 * It helps avoid code duplication and makes initialization logic more
 * maintainable.
 * Types of Constructor Chaining :
 * Within the same class — using this(...)
 * From a child class to parent — using super(...)
 * this(...) must be the first statement in a constructor when calling another
 * constructor in the same class.
 * super(...) must be the first statement when calling a parent constructor.
 * You cannot call both this(...) and super(...) in the same constructor.
 */

public class constructorChaining {
    private String name;
    private int age;
    private String course;

    // constructor 1
    constructorChaining() {
        this("Unknown", 0); // calls constructor 2
        System.out.println("Default constructor called");
    }

    // constructor 1
    constructorChaining(String name, int age) {
        this(name, age, "Unknown"); // calls constructor 3
        System.out.println("Constructor with name and age called");
    }

    // constructor 1
    constructorChaining(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with all parameters called");
    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age + ", Course : " + course);
    }

    public static void main(String[] args) {
        constructorChaining s1 = new constructorChaining();
        s1.display();

        constructorChaining s2 = new constructorChaining("Umar", 25);
        s2.display();

        constructorChaining s3 = new constructorChaining("Umar", 25, "MCA");
        s3.display();

        childClass c=new childClass("Umar",30 );
        c.display();
    }
}

class childClass extends constructorChaining {
    childClass(String name, int age) {
        super(name, age);
        System.out.println("Called parent constructor from child class");
    }
}