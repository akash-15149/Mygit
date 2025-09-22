import java.util.Scanner;

public class LowerBound {
    static int lowerBound(int[] arr, int key) {
        int low = 0, high = arr.length, ans = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= key) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter key for lower bound: ");
        int key = sc.nextInt();

        int idx = lowerBound(arr, key);
        if (idx == n) System.out.println("No element >= " + key);
        else System.out.println("Lower bound index: " + idx + " (value = " + arr[idx] + ")");
    }
}
