import java.util.Scanner;

import static java.lang.Math.abs;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long l = sc.nextLong();
            String n = String.valueOf(l);
            int sum = 0;
            int kt = 1;
            for (int i = 0; i < n.length(); i++){
                if (i < n.length() - 1) {
                    if (abs(n.charAt(i) - n.charAt(i +1)) != 2) kt = 0;
                }
                sum += Character.getNumericValue(n.charAt(i));
            }
            if (sum % 10 != 0) kt = 0;
            if (kt == 1) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
