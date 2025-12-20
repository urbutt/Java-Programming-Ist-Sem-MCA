/*Variable Hiding in Java happens when a subclass declares a 
  variable with the same name as a variable in its superclass,
  the subclass variable hides the superclass variable.
  meaning that when you access the variable through a subclass reference,
  the subclass's version is used.

  It can also happen when a local variable has the same name as
  an instance variable, the local variable hides the instance variable.
 */

//parent class
public class variableHiding {
    private int x = 20; // Instance variable
    int y = 40;

    public void display() {
        int x = 30; // local variable hides instance variable
        System.out.println("Local value : " + x);
        System.out.println("Instance value : " + this.x);
    }

    public static void main(String[] args) {
        variableHiding v = new variableHiding();
        v.display();

        childClass c = new childClass();
        c.display();

    }
};

// child class
class childClass extends variableHiding {
    int y = 60; // Hides Parent's value

    public void display() {
        System.out.println("Child class value : " + y);
        System.out.println("Parent class value : " + super.y);
    }

}
