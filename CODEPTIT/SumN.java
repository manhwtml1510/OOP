import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test; i++) {
            long n = sc.nextLong();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
        sc.close();
    }
}
