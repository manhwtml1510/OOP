import java.util.*;
public class Souuthe {
    public static void main (String[] argd) {
        Scanner sc = new Scanner (System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++) {
            String N = sc.next();
            boolean check = true;
            int demchan =0;
            int demle=0;
            for(int j=0;j<N.length();j++) {
                if(!Character.isDigit(N.charAt(j))) {
                    System.out.println("INVALID");
                    check = false;
                    break;
                }
                if((N.charAt(j)-'0')%2==0) {
                    demchan++;
                } else {
                    demle++;
                }
            }
            if(!check) continue;
            if(demchan>demle && N.length()%2==0) {
                System.out.println("YES");
            } else if(demle>demchan && N.length()%2==1) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
        sc.close();
    }
}