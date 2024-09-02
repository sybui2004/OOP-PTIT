import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                s += String.valueOf(sc.nextInt());
            }
            String s2 = "";
            for (int i = n-1; i >= 0; i--) {
                s2 += String.valueOf(s.charAt(i));
            }
            if (s.equals(s2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
