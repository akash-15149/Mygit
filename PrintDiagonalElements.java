import java.util.Scanner;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("Primary diagonal elements:");
        for (int i = 0; i < n; i++) System.out.print(mat[i][i] + " ");

        System.out.println("\nSecondary diagonal elements:");
        for (int i = 0; i < n; i++) System.out.print(mat[i][n - i - 1] + " ");
    }
}
