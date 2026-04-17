import java.util.Scanner;

public class WalkingMaster {
    public static int f(int curx, int cury, int tarx, int tary) {

        if (tary < cury)
            return -1;
    
        int ops = 0;

        int diagDist = Math.abs(tary - cury);

        ops += diagDist;
        curx += diagDist;
        cury += diagDist;

        if (curx < tarx)
            return -1;

        int westDist = Math.abs(curx - tarx);

        ops += westDist;

        return ops;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(f(x, y, a, b));
        }
        sc.close();
    }
}
