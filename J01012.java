import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int ans = 1;
            if (n % 2 != 0){
                System.out.println(0);
                continue;
            }
            if (n == 2) {
                System.out.println(1);
                continue;
            }
            for (int i = 2; i <= sqrt(n); i++){
                if (n % i == 0) {
                    int cnt = 0;
                    while (n % i == 0) {
                        cnt++;
                        n /= i;
                    }
                    if (i != 2) ans *= (cnt + 1);
                    else ans *= cnt;
                }
            }

            if (n > 1) ans *= 2;
            System.out.println(ans);
        }
    }
}
