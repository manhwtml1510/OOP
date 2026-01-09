import java.util.*;

class PhongBan {
    String ma, ten;
    public PhongBan(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
}
class NhanVien {
    String ma, ten, maPhong;
    long luongCoBan, soNgayCong;
    long heSo;
    String tenPhong;

    public NhanVien(String ma, String ten, long luongCoBan, long soNgayCong, Map<String, String> phongBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;

        char loai = ma.charAt(0);
        int nam = Integer.parseInt(ma.substring(1, 3));
        this.maPhong = ma.substring(3);

        this.tenPhong = phongBan.get(this.maPhong);

        this.heSo = tinhHeSo(loai, nam);
    }

    private long tinhHeSo(char loai, int nam) {
        if (loai == 'A') {
            if (nam <= 3) return 10;
            if (nam <= 8) return 12;
            if (nam <= 15) return 14;
            return 20;
        }
        if (loai == 'B') {
            if (nam <= 3) return 10;
            if (nam <= 8) return 11;
            if (nam <= 15) return 13;
            return 16;
        }
        if (loai == 'C') {
            if (nam <= 3) return 9;
            if (nam <= 8) return 10;
            if (nam <= 15) return 12;
            return 14;
        }
        if (nam <= 3) return 8;
        if (nam <= 8) return 9;
        if (nam <= 15) return 11;
        return 13;
    }
    public long tinhLuong() {
        return luongCoBan * soNgayCong * heSo * 1000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + tenPhong + " " + tinhLuong();
    }
}
public class Tinhluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPhong = Integer.parseInt(sc.nextLine());
        Map<String, String> dsPhong = new HashMap<>();
        for (int i = 0; i < nPhong; i++) {
            String ma = sc.next();
            String ten = sc.nextLine().trim();
            dsPhong.put(ma, ten);
        }
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            long luongCoBan = Long.parseLong(sc.nextLine().trim());
            long ngayCong = Long.parseLong(sc.nextLine().trim());
            list.add(new NhanVien(ma, ten, luongCoBan, ngayCong, dsPhong));
        }
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
