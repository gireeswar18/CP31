import java.util.Scanner;

public class JaggedSwaps {

    public static boolean f(int[] arr, int n) {

        int min = arr[1];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }

        return arr[0] < min;
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

            System.out.println(f(arr, n) ? "Yes" : "No");
        }

        sc.close();
    }
}