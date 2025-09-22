import java.util.Scanner;

public class DeleteAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter position (0-based index) to delete: ");
        int pos = sc.nextInt();

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            if (i == pos) continue;
            System.out.print(arr[i] + " ");
        }
    }
}
