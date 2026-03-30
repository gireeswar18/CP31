import java.util.Scanner;

public class LineTrip {

    public static int f(int[] arr, int n, int x) {

        int res = 0;
        int prev = 0;

        for (int i = 0; i < n; i++) {
            res = Math.max(res, arr[i] - prev);
            prev = arr[i];
        }

        return Math.max(res, (x - arr[n - 1]) * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(f(arr, n, x));
        }

        sc.close();
    }
}
