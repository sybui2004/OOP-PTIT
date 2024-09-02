import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            for (int j = 2; j <= sqrt(n); j++) {
                if (n % j == 0){
                    int cnt = 0;
                    while (n % j == 0){
                        cnt++;
                        n /= j;
                    }
                    System.out.print(j + "(" + cnt + ") ");
                }
            }
            if (n > 1){
                System.out.print(n + "(1) ");
            }
            System.out.println();
        }
    }
}
