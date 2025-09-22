import java.util.Scanner;

public class BinarySearch {
    static int binarySearchIterative(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] < key) return binarySearchRecursive(arr, key, mid + 1, high);
        return binarySearchRecursive(arr, key, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int idxIter = binarySearchIterative(arr, key);
        int idxRec = binarySearchRecursive(arr, key, 0, n - 1);

        System.out.println("Iterative Search Index: " + idxIter);
        System.out.println("Recursive Search Index: " + idxRec);
    }
}
