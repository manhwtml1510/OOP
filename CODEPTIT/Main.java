import java.util.*;

class LopHocPhan {
    String maGV, maMon;
    double gioChuan;

    public LopHocPhan(String maGV, String maMon, double gioChuan) {
        this.maGV = maGV;
        this.maMon = maMon;
        this.gioChuan = gioChuan;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nMon = Integer.parseInt(sc.nextLine());
        Map<String, String> monHoc = new HashMap<>();

        for (int i = 0; i < nMon; i++) {
            String line = sc.nextLine();
            String ma = line.split(" ")[0];
            String ten = line.substring(ma.length()).trim();
            monHoc.put(ma, ten);
        }
        int nGV = Integer.parseInt(sc.nextLine());
        Map<String, String> giangVien = new HashMap<>();

        for (int i = 0; i < nGV; i++) {
            String maGV = sc.next();
            String tenGV = sc.nextLine().trim();
            giangVien.put(maGV, tenGV);
        }
        int nLop = Integer.parseInt(sc.nextLine());
        List<LopHocPhan> list = new ArrayList<>();
        for (int i = 0; i < nLop; i++) {
            String maGV = sc.next();
            String maMon = sc.next();
            double gio = sc.nextDouble();
            list.add(new LopHocPhan(maGV, maMon, gio));
        }
        sc.nextLine();
        String maGVCanXuat = sc.nextLine().trim();

        System.out.println("Giang vien: " + giangVien.get(maGVCanXuat));

        double tong = 0.0;
        for (LopHocPhan l : list) {
            if (l.maGV.equals(maGVCanXuat)) {
                System.out.println(monHoc.get(l.maMon) + " " + l.gioChuan);
                tong += l.gioChuan;
            }
        }
        System.out.printf("Tong: %.2f", tong);
    }
}
