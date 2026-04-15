import java.util.*;

public class TargetPractice {

    public static int getPts(int r, int c) {

        if (r == 0 || r == 9 || c == 0 || c == 9)
            return 1;
        if (r == 1 || r == 8 || c == 1 || c == 8)
            return 2;
        if (r == 2 || r == 7 || c == 2 || c == 7)
            return 3;
        if (r == 3 || r == 6 || c == 3 || c == 6)
            return 4;
        if (r == 4 || r == 5 || c == 4 || c == 5)
            return 5;

        return 0;
    }

    public static int f(List<String> list) {

        int res = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (list.get(i).charAt(j) == 'X') {
                    res += getPts(i, j);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- != 0) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(sc.next());
            }

            System.out.println(f(list));
        }

        sc.close();
    }
}