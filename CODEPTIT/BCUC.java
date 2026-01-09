import java.util.*;
import java.math.BigInteger;
public class BCUC {
    public static void main (String[] argd) {
        Scanner sc = new Scanner (System.in);
        int test = sc.nextInt();
        while (test-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            BigInteger A = BigInteger.valueOf(a);
            BigInteger B = BigInteger.valueOf(b);
            long UCLN = A.gcd(B).longValue();
            long BCNN = (a/UCLN) *b;
            System.out.println(BCNN + " " + UCLN);
        }
        sc.close();
    }
}