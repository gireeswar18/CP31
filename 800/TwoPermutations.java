import java.util.Scanner;

public class TwoPermutations {

    public static String f(int n, int a, int b) {

        if (n == a && n == b)
            return "Yes";

        if (n - (a + b) >= 2)
            return "Yes";

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(f(n, a, b));
        }
        
        sc.close();
    }
}