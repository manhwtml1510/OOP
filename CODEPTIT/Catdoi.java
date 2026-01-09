import java.util.Scanner;
public class Catdoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            StringBuilder res = new StringBuilder();
            boolean invalid = false;
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '0': res.append('0'); break;
                    case '1': res.append('1'); break;
                    case '8': res.append('0'); break;
                    case '9': res.append('0'); break;
                    default: invalid = true; break;
                }
                if (invalid) break;
            }

            if (invalid) {
                System.out.println("INVALID");
            } else {
                String result = res.toString().replaceFirst("^0+", "");
                if (result.isEmpty()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(result);
                }
            }
        }
        sc.close();
    }
}
