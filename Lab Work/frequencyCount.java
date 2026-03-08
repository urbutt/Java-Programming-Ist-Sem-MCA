import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text : ");
        String text = scan.nextLine();
        System.out.print("Enter character : ");
        char c=scan.next().charAt(0);
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == c) {
                count++;
            }
        }
        System.out.print("Total count : " + (count));
        scan.close();
    }
}
