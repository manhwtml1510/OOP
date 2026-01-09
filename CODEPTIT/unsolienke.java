import java.util.*;
public class unsolienke {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test;i++) {
            boolean check1 = true;
            boolean check2 = true;
            int sum =0;
            String N = sc.next();
            for (int j=1; j<N.length();j++) {
                if(N.charAt(j) - N.charAt(j-1)!= 2 && N.charAt(j) - N.charAt(j-1)!= -2) {
                    check1 = false;
                    break;
                }
            }
            for (int j=0; j<N.length();j++) {
                sum+=(int)N.charAt(j) - '0';
            }
                if (sum % 10 !=0) {
                    check2 = false;  
            }
            if (check1 && check2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}
