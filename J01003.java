import java.text.DecimalFormat;
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0f) {
            if (b == 0f) {
                System.out.println("VN");
            } else {
                System.out.println("VSN");
            }
        } else {
            System.out.printf("%.2f", -b/a);
        }
    }
}