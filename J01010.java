import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Long l = sc.nextLong();
            String s = String.valueOf(l);
            long ans = 0;
            int kt = 1;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                    ans *= 10L;
                }else if (s.charAt(i) == '1'){
                    ans = ans * 10L + 1L;
                }else{
                    kt = 0;
                }
            }
            if (ans == 0){
                System.out.println("INVALID");
                continue;
            }
            if (kt == 1) {
                System.out.println(ans);
            }else{
                System.out.println("INVALID");
            }
        }

    }
}
