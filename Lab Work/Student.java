public class Student {
    private int age;
    int enrollment_No;
    private static int object_counter = 0;

    void age(int val) {
        if (val >= 4 && val <= 40) {
            age = val;
        } else {
            System.out.println("Invalid age");
        }
    }

    Student() {
        object_counter++;
        enrollment_No = object_counter;
    }

    static int counter() {
        return object_counter;
    }

    int getage() {
        return age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        object_counter--;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age(25);
        System.out.println("Age : " + s1.getage() + ", Count " + counter());

        Student s2 = new Student();
        s2.age(35);
        System.out.println("Age : " + s2.getage() + ", Count " + counter());

        Student s3 = new Student();
        s1.age(45);
        s3 = null;
        System.out.println("Count " + counter());

        Student s4 = new Student();
        s4.age(7);
        System.out.println("Age : " + s4.getage() + ", Count " + counter());

    }
}
