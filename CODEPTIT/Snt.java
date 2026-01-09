import java.util.Scanner;
public class Snt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        boolean isPrime = true;
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            if (n<2) {
                System.out.println("NO");
            } else {
                for (int j =2; j<n; j++) {
                    if (n%j==0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
