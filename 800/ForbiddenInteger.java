import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForbiddenInteger {

    public static void f(int n, int k, int x) {

        if (n == 1 && x == 1) {
            System.out.println("NO");
            return;
        }

        List<Integer> res = new ArrayList<>();

        if (x != 1) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                res.add(1);
            }
        }
        else if (n % 2 == 0) {
            if (k > 1) {
                System.out.println("YES");
                for (int i = 0; i < (n / 2); i++) {
                    res.add(2);
                }
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        else {
            if (k > 2) {
                System.out.println("Yes");
                res.add(3);
                n -= 3;

                for (int i = 0; i < (n / 2); i++) {
                    res.add(2);
                }
            }
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(res.size());
        for (int num : res) 
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            f(n, k, x);
        }
        sc.close();
    }
}
