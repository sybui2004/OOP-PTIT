import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int tmp = (int) sqrt(n);
            if (tmp * tmp == n) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
