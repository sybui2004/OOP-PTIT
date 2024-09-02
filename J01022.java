import java.util.Scanner;

public class J01022 {
    public static long[] f = new long[100];

    public static void Fibonacci() {
        f[0] = 0L;
        f[1] = 1L;
        for (int i = 2; i < 100; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static char Try(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        if (k <= f[n - 2]) {
            return Try(n - 2, k);
        }
        return Try(n - 1, k - f[n - 2]);
    }

    public static void main(String[] args) {
        Fibonacci();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
