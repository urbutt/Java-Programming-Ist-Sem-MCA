public class A {
    private int id;
    protected int salary;
    int age;
    public String name;
    public int birthYear = 2004;

    private int setId(int val) {
        id = val;
        return id;
    }

    protected int setSalary(int val) {
        salary = val;
        return salary;
    }

    int setAge(int val) {
        age = val;
        return age;
    }

    public String setName(String val) {
        name = val;
        return name;
    }

    public void info() {
        System.out.print("I love C++");
    }

    public static void main(String[] args) {
        B o = new B();
        System.out.println("Inherited Values : ");
        System.out.println("Age :" + o.setAge(20));
        System.out.println("Name : " + o.setName("Jack"));
        System.out.println("Salary : " + o.setSalary(20000));
        System.out.println("Id not inherited! Private members");
        System.out.println();
        o.display();
        System.out.println();
        o.info();
        o.original();
        System.out.println();
        A a1 = new B();
        // accessing shadowed data member using reference variable of type A and object
        // of type B
        System.out.println(a1.birthYear);
    }

}

class B extends A {
    protected int birthYear = 2001; // shadowing

    public void display() {

        System.out.println("Birth Year (Child Class) : " + birthYear);
        System.out.println("Birth Year (Parent Class) : " + super.birthYear);
    }

    // overriding info method
    @Override
    public void info() {
        System.out.println("I love Java (Overridden)");
    }

    void original() {
        super.info();
        System.out.println(" (Original)");
    }

}
