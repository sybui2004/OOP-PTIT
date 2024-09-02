import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int cnt4 = 0, cnt7 = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4') cnt4++;
            if (n.charAt(i) == '7') cnt7++;
        }
        if (cnt7 + cnt4 == 7 || cnt7 + cnt4 == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
