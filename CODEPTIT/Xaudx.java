import java.util.*;
public class Xaudx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String N= sc.next();
            int dem = 0;
            int l = N.length();
            for( int j=0;j<l/2;j++) {
                if (N.charAt(j) != N.charAt(l-j-1)) {
                    dem++;
                }
            }
            if(dem==1) System.out.println("YES");
            else if (dem==0 && l%2==1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    
}
