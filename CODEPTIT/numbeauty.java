import java.util.*;
public class numbeauty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test  = sc.nextInt();
        for (int i=0; i<test; i++) {
            boolean check = true;
            String N = sc.next();
            for (int j=0;j<N.length();j++) {
                if ((N.charAt(j)-'0') %2!=0) {
                    check = false;
                    break;
                }
            }
           if (check) {
                for (int l = 0; l < N.length() / 2; l++) {
                    if (N.charAt(l) != N.charAt(N.length() - 1 - l)) {
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
    sc.close();
    }
}
