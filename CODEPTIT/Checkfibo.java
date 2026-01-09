import java.util.Scanner;
public class Checkfibo {
    public static boolean isscp(long x) {
        long s = (long)Math.sqrt(x);
        return s*s== x || (s+1)*(s+1) ==x;
    }
    public static boolean isFibonacci(long n) {
        return isscp(5*n*n + 4) || isscp(5*n*n - 4);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0;i<test;i++) {
            long n= sc.nextLong();
            if (isFibonacci(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
