import java.util.*;
import java.math.BigInteger;

public class chiahet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger mod1 = a.mod(b);
            BigInteger mod2 = b.mod(a);
            BigInteger Zero = BigInteger.ZERO;
            if (mod1.equals(Zero) || mod2.equals(Zero)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
