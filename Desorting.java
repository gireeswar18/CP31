import java.util.Scanner;

public class Desorting {

    public static int f(int[] arr, int n) {
        int ops = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return 0;
            }
        }

        for (int i = 1; i < n; i++) {
            int op = ((arr[i] - arr[i - 1]) / 2)+ 1;
            ops = Math.min(ops, op);
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
