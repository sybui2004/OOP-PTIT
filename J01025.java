import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int xl = min(x0, x2);
        int yl = min(y0, y2);
        int xr = max(x1, x3);
        int yr = max(y1, y3);
        int ans = max((xr - xl) * (xr - xl), (yr - yl) * (yr - yl));
        System.out.println(ans);
    }
}
