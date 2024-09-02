import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Long []f = new Long[100];
        f[0] = 0L;
        f[1] = 1L;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
