import java.util.Scanner;

public class DeleteAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Array after deleting last element:");
        for (int i = 0; i < n - 1; i++) System.out.print(arr[i] + " ");
    }
}
