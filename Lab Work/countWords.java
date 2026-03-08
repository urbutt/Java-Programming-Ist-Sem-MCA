import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text : ");
        String text = scan.nextLine();
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == ' ') {
                count++;
            }
        }
        System.out.print("Total words : "+(count+1));
        scan.close();
    }
}
