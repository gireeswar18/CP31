import java.util.Scanner;

public class ExtremelyRound {

    public static int f(int n) {

        int res = 0;

        while (n > 9) {
            if (n > 99_999) {
                res += (n / 100_000);
                n = 99_999;
            }
            else if (n > 9999) {
                res += (n / 10000);
                n = 9999;
            }
            else if (n > 999) {
                res += (n / 1000);
                n = 999;
            }
            else if (n > 99) {
                res += (n / 100);
                n = 99;
            }
            else {
                res += (n / 10);
                n = 9;
            }
        }

        return res + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            System.out.println(f(n));
        }

        sc.close();
    }
}
