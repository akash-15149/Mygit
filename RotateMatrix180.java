import java.util.Scanner;

public class RotateMatrix180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("Matrix after 180 degree rotation:");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
