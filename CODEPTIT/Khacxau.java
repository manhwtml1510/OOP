import java.util.*;
public class Khacxau {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine().trim());
        while (test-->0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("\\s+")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            List<String> result = new ArrayList<>();
            for(String word : set1) {
                if(!set2.contains(word))
                result.add(word);
            }
            for (int i=0; i<result.size();i++) {
                if(i>0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();
    }
    sc.close();
}
}
