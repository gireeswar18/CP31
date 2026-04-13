import java.util.*;

public class GrassHopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0 ) {
            int target = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> res = new ArrayList<>();

            int longest = target;

            while (target != 0) {
                if (longest % k == 0) {
                    longest--;
                }
                else if (longest > target) {
                    longest--;
                }
                else {
                    target -= longest;
                    res.add(longest);
                }
            }

            System.out.println(res.size());
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
