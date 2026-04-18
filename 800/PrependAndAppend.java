import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- != 0) {
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();

            int l = 0;
            int r = n - 1;

            while (l < r) {
                if (arr[l] == arr[r]) {
                    break;
                }
                l++;
                r--;
            }

            System.out.println(r - l + 1);
        }

        sc.close();
    }
}
