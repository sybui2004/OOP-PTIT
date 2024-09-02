import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01013 {
    static long prime[] = new long[2000001];

    public static void Sieve(){
        for(int p = 2; p*p <= 2000000; p++){
            if(prime[p] == 0){
                for(int i = p*p; i <= 2000000; i += p)
                    prime[i] = (long) p;
            }
        }

        for (int i = 2; i <= 2000000; i++){
            if (prime[i] == 0) prime[i] = (long) i;
        }
    }

    public static void main(String[] args) {
        Sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0L;
        while (n-- > 0){
            int ip = sc.nextInt();
            while (ip != 1){
                ans += prime[ip];
                ip /= prime[ip];
            }
        }

        System.out.println(ans);
    }
}
