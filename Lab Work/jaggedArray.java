public class jaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4 },
                { 1, 2, 3 },
                { 1, 2 },
                { 1 } };
        for (int row[] : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
