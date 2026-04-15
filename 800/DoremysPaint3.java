import java.util.*;

public class DoremysPaint3 {

    public static boolean f(int[] arr, int n) {

        int num1 = -1;
        int n1cnt = 0;
        int num2 = -1;
        int n2cnt = 0;

        for (int num : arr) {
            if (num1 == -1 || num == num1) {
                num1 = num;
                n1cnt++;
            }
            else if (num2 == -1 || num == num2) {
                num2 = num;
                n2cnt++;
            }
            else {
                return false;
            }
            // System.out.println(num1 + ": " + n1cnt);
            // System.out.println(num2 + ": " + n2cnt);
        }

        if (n1cnt == 0 || n2cnt == 0)
            return true;

        if (n % 2 == 0) {
            return n1cnt == n2cnt;
        }

        return Math.abs(n1cnt - n2cnt) <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0) {
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
