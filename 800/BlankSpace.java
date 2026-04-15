import java.util.Scanner;

public class BlankSpace {

    public static int f(int[] arr, int n) {
        int cnt = 0;
        int res = 0;

        for (int num : arr) {
            if (num == 0) {
                cnt++;
            }
            else {
                res = Math.max(res, cnt);
                cnt = 0;
            }
        }

        return Math.max(res, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(f(arr, n));
        }

        sc.close();
    }
}
