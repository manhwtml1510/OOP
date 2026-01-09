import java.util.Scanner;
public class Chia2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =0; i<test; i++) {
            long a = sc.nextLong();
            int dem = 0;
            for(long j = 2; j*j<=a;j++) {
                if (a%j==0){
                    long check= a/j;
                    if(j%2==0) {
                        dem++;
                    }
                    if(check!=j && check%2==0) {
                        dem++;
                    }

                }
            }
            if(a%2==0) {
                dem++;
            }
            System.out.println(dem);
        }
        sc.close();
    }
}
