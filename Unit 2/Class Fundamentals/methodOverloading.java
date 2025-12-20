/*In Java, method overloading allows multiple methods in the same class
 to share the same name but must differ in their parameter list (number, 
 type, or order of parameters). This is a form of compile-time polymorphism.
 Also Return type alone cannot differentiate overloaded methods.
 
 Constructor Overloading means having multiple constructors in the
 same class with different parameter lists. The compiler decides which
 constructor to call based on the number and type of arguments.
 */

//Demonstrating method overloading
public class methodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    // changing number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // changing datatype of parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodOverloading m = new methodOverloading();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
        System.out.println(m.add(23.123, 16.877));
    }

}