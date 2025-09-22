import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] == x) {
                    System.out.println("Found at (" + i + ", " + j + ")");
                    found = true;
                }

        if (!found) System.out.println("Element not found.");
    }
}
