import java.util.Scanner;
public class convertString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string : ");
        String text = scan.nextLine();
        char ch[]=text.toCharArray();
        for (int index = 0; index < ch.length; index++) {
            System.out.print(ch[index]);
        }
        scan.close();
    }
}
