import java.util.Scanner;

public class EverybodyLikesGoodArrays {

    public static int f(int[] arr, int n) {
        int ops = 0;
        int prev = arr[0] % 2;

        for (int i = 1; i < n; i++) {
            int curr = arr[i] % 2;
            if (curr == prev) {
                ops++;
            }
            else {
                prev = curr;
            }
        }

        return ops;

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