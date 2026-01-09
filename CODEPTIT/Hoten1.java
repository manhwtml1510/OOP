import java.util.*;
public class Hoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0) {
            String s = sc.nextLine().trim();
            String[] words = s.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String w: words) {
                if (w.length()>0){
                    result.append(Character.toUpperCase(w.charAt(0)));
                    if (w.length()>1) {
                        result.append(w.substring(1).toLowerCase());
                    }
                    result.append(" ");
                }
            }
            System.out.println(result.toString().trim());
        }
        sc.close();
    }
}
