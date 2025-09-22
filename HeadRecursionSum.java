import java.util.Scanner;

public class HeadRecursionSum {
    static void sumHeadRecursion(int n, int current, int sum) {
        if (current > n) {
            System.out.println("Sum = " + sum);
            return;
        }
        sumHeadRecursion(n, current + 1, sum + current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sumHeadRecursion(n, 1, 0);
    }
}
