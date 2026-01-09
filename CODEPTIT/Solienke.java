import java.util.Scanner;
public class Solienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test; i++){
            String s = sc.next();
            boolean check = true;
            for(int j = 1; j<s.length()-1; j++) {
                if (s.charAt(j) - s.charAt(j-1) !=1 && s.charAt(j) - s.charAt(j-1) !=-1) {
                    check = false;
                    break;
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
