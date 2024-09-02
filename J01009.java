import java.math.BigInteger;
import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger ans = BigInteger.valueOf(0);
        BigInteger tmp = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++){
            tmp = tmp.multiply(BigInteger.valueOf(i));
            ans = ans.add(tmp);
        }
        System.out.println(ans);

    }
}
