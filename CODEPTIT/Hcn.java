import java.util.Scanner;
public class Hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<=0 || b<=0) {
            System.out.println(0);
        } else {
            int s = a*b;
            int p = (a+b)*2;
            System.out.println(p + " " + s);
        }
        sc.close();
    }
}
