import java.util.*;
import java.math.BigInteger;
public class Hieuso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger res = a.subtract(b).abs();
            if (res.bitLength()<b.bitLength()) {
                System.out.println();
                System.out.print("0");
            } else {
                System.out.print(res.toString());
            }
        }
        sc.close();
    }
    
}
