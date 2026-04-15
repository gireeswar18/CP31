import java.util.Scanner;

public class HowMuchDoesDaytonaCost {

    public static boolean f(int[] arr, int n, int k) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(f(arr, n, k) ? "Yes" : "No");
        }
        sc.close();
    }
}
