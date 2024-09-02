import java.util.*;

import static java.util.Arrays.sort;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
