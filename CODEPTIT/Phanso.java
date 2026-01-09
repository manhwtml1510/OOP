import java.util.*;

public class Phanso {
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong(), mau = sc.nextLong();
        long gcd = gcd(tu, mau);
        System.out.println(tu/gcd + "/" + mau/gcd);
        sc.close();
    }
}
