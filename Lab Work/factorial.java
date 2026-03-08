import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    static BigInteger fact(int num) {
        if (num == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(fact(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        System.out.println("Factorial of "+num+" = " + fact(num));
        scan.close();
    }
}
