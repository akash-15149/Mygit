import java.util.Scanner;

public class FrequencyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to find frequency: ");
        int x = sc.nextInt();

        int count = 0;
        for (int val : arr) if (val == x) count++;

        System.out.println("Frequency of " + x + " = " + count);
    }
}
