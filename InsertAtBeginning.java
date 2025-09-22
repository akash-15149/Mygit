import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to insert at beginning: ");
        int x = sc.nextInt();

        arr[0] = x;
        System.out.println("Array after insertion:");
        for (int val : arr) System.out.print(val + " ");
    }
}
