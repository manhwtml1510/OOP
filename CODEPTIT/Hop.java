import java.util.*;
public class Hop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [] a = new int[m+n];
        Set<Integer> A = new HashSet<>();
        for(int i=0;i<n;i++) {
            A.add(sc.nextInt());
        }
        for(int i=0;i<m;i++) {
            A.add(sc.nextInt());
        }
        A.retainAll(A);
        List<Integer> list = new ArrayList<>(A);
        Collections.sort(list);
        for(int x : list) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}