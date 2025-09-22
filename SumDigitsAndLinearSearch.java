import java.util.Scanner;

public class SumDigitsAndLinearSearch {
    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int linearSearchIterative(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    static int linearSearchRecursive(int[] arr, int key, int index) {
        if (index >= arr.length) return -1;
        if (arr[index] == key) return index;
        return linearSearchRecursive(arr, key, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(n));

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int idxIter = linearSearchIterative(arr, key);
        int idxRec = linearSearchRecursive(arr, key, 0);

        System.out.println("Iterative Search Index: " + idxIter);
        System.out.println("Recursive Search Index: " + idxRec);
    }
}
