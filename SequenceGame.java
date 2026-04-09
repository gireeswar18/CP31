import java.util.*;

public class SequenceGame {

    public static void f(int[] arr, int n) {
        List<Integer> res = new ArrayList<>();
        res.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                res.add(arr[i]);
            }
            res.add(arr[i]);
        }

        System.out.println(res.size());
        for (int num : res) {
            System.out.print(num + " ");
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