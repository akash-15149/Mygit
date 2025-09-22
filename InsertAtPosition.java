import java.util.Scanner;

public class InsertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter position (0-based index): ");
        int pos = sc.nextInt();
        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();

        for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = x;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) System.out.print(arr[i] + " ");
    }
}
