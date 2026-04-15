import java.util.Scanner;

public class Coins {

    public static String f(long n, long k) {
        if (n % 2 == 0 || n % k == 0)
            return "Yes";

        if (k % 2 != 0 && (n - k) % 2 == 0)
            return "Yes";

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(f(n, k));
        }

        sc.close();
    }
}
