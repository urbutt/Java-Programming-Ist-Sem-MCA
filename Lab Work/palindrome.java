import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        if (text.contains(sb)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }

}
