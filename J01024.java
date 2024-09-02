import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String line = String.valueOf(sc.nextLong());
            int kt = 1;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != '0' && line.charAt(i) != '1' && line.charAt(i) != '2') {
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
