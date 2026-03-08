/*
 * Constructor chaining in Java is the process of calling one
 * constructor from another within the same class or from a child class.
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
        System.out.println("1.Default constructor called");
    }

    // constructor 2
    constructorChaining(String name, int age) {
        this(name, age, "Unknown"); // calls constructor 3
        System.out.println("2.Constructor with name and age called");
    }

    // constructor 3
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

        childClass c = new childClass();
        c.display();
    }
}

class childClass extends constructorChaining {
    childClass() {
        super("Umar", 30);
        System.out.println("Called parent constructor from child class");
    }
}