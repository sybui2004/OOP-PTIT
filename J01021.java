import java.util.Scanner;

public class J01021 {

    public static long PowMod(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % 1000000007;
            a = (a * a) % 1000000007;
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0){
                return;
            }
            System.out.println(PowMod(a, b));
        }

    }
}

