import java.util.Arrays;
import java.util.Scanner;

public class MakeItBeautiful {

    public static void f(int[] arr, int n) {
        Arrays.sort(arr);

        if (arr[0] == arr[n - 1]) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        System.out.print(arr[n - 1] + " ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
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
