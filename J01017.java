import java.util.Scanner;

import static java.lang.Math.abs;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            String s = String.valueOf(n);
            int kt = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (abs(s.charAt(i) - s.charAt(i + 1)) != 1){
                    kt = 0;
                    break;
                }
            }
            if (kt == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
