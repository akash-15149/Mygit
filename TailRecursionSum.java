import java.util.Scanner;

public class TailRecursionSum {
    static int sumTailRecursion(int n) {
        if (n == 0) return 0;
        return n + sumTailRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + sumTailRecursion(n));
    }
}
