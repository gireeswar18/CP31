import java.util.Scanner;

public class TwinPermutations {

    public static void f(int[] arr, int n) {
        
        for (int num : arr) {
            System.out.print(n - num + 1 + " ");
        }
        System.out.println();
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

            f(arr, n);
        }

        sc.close();
    }
}
