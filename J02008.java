import java.util.Scanner;

public class J02008 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 1L;
            for (int i = 1; i <= n; i++) {
                ans = ans * i / gcd(ans, i);
            }

            System.out.println(ans);
        }
    }
}
