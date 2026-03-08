public class overloading {
    int sum(int n1, int n2) {
        return n1 + n2;
    }

    double sum(double n1, double n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        overloading o = new overloading();
        System.out.println(o.sum(4, 5));
        System.out.println(o.sum(4.5, 5.5));

    }
}
