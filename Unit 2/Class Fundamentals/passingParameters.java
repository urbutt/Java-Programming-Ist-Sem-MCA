//pass by value= primitive data types 
//pass by reference= when using objects
public class passingParameters {
    static void changePrimitive(int x) {
        x = 20; // only changes local copy
    }

    static void changeObject(Person p) {
        p.name = "Updated Name"; // changes original object
    }

    public static void main(String[] args) {
        int x = 10;
        changePrimitive(x);
        System.out.println("Value of x = " + x);// still same

        Person p = new Person("Original Name");
        changeObject(p);
        System.out.println("After passing object reference, name = " + p.name);// Updated Name
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}