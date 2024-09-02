import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long l = sc.nextLong();
            long ans = 0;
            for (long i = 2; i * i <= l; i++) {
                if (l % i == 0) {
                    ans = i;
                    while (l % i == 0) {
                        l /= i;
                    }
                }
            }
            if (l > 1) ans = l;

            System.out.println(ans);
        }
    }
}
