import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        Long []f = new Long[100];
        f[0] = 0L;
        f[1] = 1L;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i <= 92; i++){
            map.put(f[i], 1);
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            if (map.containsKey(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
