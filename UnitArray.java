import java.util.Scanner;

public class UnitArray {
    public static int f(int[] arr, int n) {
        int ops = 0;
        int pos = 0, neg = 0;

        for (int num : arr) {
            if (num < 0) {
                neg++;
            }
            else {
                pos++;
            }
        }

        while (pos < neg || neg % 2 == 1) {
            neg--;
            pos++;
            ops++;
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
