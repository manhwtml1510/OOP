import java.util.Scanner;
public class ArrayDX {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0;i<test;i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int j=0;j<n;j++) {
                arr[j] = sc.nextLong();
            }
            boolean check = true;
            for (int j=0;j<n/2;j++) {
                if (arr[j]!=arr[n-1-j]) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
