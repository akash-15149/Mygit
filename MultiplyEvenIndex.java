import java.util.Scanner;

public class MultiplyEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int product = 1;
        for (int i = 0; i < n; i += 2) product *= arr[i];

        System.out.println("Product of elements at even indices: " + product);
    }
}
