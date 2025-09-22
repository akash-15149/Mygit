import java.util.Scanner;

public class McCarthy91 {
    static int mcCarthy91(int n) {
        if (n > 100) return n - 10;
        return mcCarthy91(mcCarthy91(n + 11));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("McCarthy 91 result = " + mcCarthy91(n));
    }
}
