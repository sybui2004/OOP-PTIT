import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.util.Arrays.sort;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        sort(b);
        for (int i = 0; i < m; i++) {
            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
                set.remove(b[i]);
            }
        }

    }
}
