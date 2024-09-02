import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int []a = new int[n];
            int []count = new int[100005];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                count[a[i]]++;
            }

            System.out.println("Test " + t + ":");

            for (int i = 0; i < n; i++) {
                if (count[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + count[a[i]] + " lan");
                    count[a[i]] = 0;
                }
            }
        }
    }
}
