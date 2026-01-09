import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int sum=0;
        for (int i=0; i<N.length(); i++) {
            if (N.charAt(i) == '4'|| N.charAt(i) =='7') {
                sum++;
            }
        }
        if (sum == 4 || sum == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
