import java.util.Scanner;

public class DontTryToCount {

    public static int f(String s, String x, int n1, int n2) {

        if (s.contains(x))
            return 0;

        int cnt = 0;

        while (n1 <= n2) {
            s += s;
            n1 *= 2;
            cnt++;

            if (s.contains(x)) 
                return cnt;
        }

        if ((s + s).contains(x))
            return cnt + 1;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            String s = sc.next();
            String x = sc.next();
            
            int res = f(s, x, n1, n2);
            System.out.println(res);
        }
        sc.close();
    }
}
