import java.util.Scanner;
import java.lang.Math;
public class Scp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test; i++) {
            int a= sc.nextInt();
            if (Math.sqrt(a) == (int)(Math.sqrt(a))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}