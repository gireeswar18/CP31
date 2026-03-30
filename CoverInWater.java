import java.util.Scanner;

public class CoverInWater {

    public static int f(char[] arr, int n) {

        int cnt = 0;

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] == '.' && arr[i + 1] == '.' && arr[i + 2] == '.')
                return 2;
            if (arr[i] == '.')
                cnt++;
        }
        if (n - 2 >= 0 && arr[n - 2] == '.')
            cnt++;
        if (n - 1 >= 0 &&arr[n - 1] == '.')
            cnt++;

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(f(str.toCharArray(), n));
        }

        sc.close();
    }
     
}