import java.util.*;

public class UnitedWeStand {

    public static void f(int[] arr, int n) {
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        int max = -1;
        for (int num : arr) {
            max = Math.max(num, max);
        }

        for (int i = 0; i < n; i++) {
            if (max == arr[i]) {
                c.add(arr[i]);
            }
            else {
                b.add(arr[i]);
            }
        }

        if (b.size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(b.size() + " " + c.size());
        for (int num : b)
            System.out.print(num + " ");
        System.out.println();
        for (int num : c)
            System.out.print(num + " ");
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