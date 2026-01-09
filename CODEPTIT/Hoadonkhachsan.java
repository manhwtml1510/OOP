import java.util.*;
import java.text.*;

class KhachHang {
    String ma, ten, soPhong;
    Date ngayNhan, ngayTra;
    int phuThu;
    long soNgay;
    long thanhTien;

    public KhachHang(int index, String ten, String soPhong, String nhan, String tra, int phuThu) throws Exception {
        this.ma = String.format("KH%02d", index);
        this.ten = ten.trim();
        this.soPhong = soPhong.trim();
        this.phuThu = phuThu;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhan = sdf.parse(nhan);
        this.ngayTra = sdf.parse(tra);

        long diff = (ngayTra.getTime() - ngayNhan.getTime()) / (1000 * 60 * 60 * 24);
        this.soNgay = diff + 1;
        int tang = Integer.parseInt(soPhong.substring(0, 1));
        int donGia = 0;
        switch (tang) {
            case 1: donGia = 25; break;
            case 2: donGia = 34; break;
            case 3: donGia = 50; break;
            case 4: donGia = 80; break;
            default: donGia = 0;
        }
        this.thanhTien = this.soNgay * donGia + phuThu;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + " " + soNgay + " " + thanhTien;
    }
}
public class Hoadonkhachsan {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        List<KhachHang> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine().trim();
            String soPhong = sc.nextLine().trim();
            String nhan = sc.nextLine().trim();
            String tra = sc.nextLine().trim();
            int phuThu = Integer.parseInt(sc.nextLine().trim());

            list.add(new KhachHang(i, ten, soPhong, nhan, tra, phuThu));
        }
        list.sort((a, b) -> Long.compare(b.thanhTien, a.thanhTien));
        for (KhachHang kh : list) {
            System.out.println(kh);
        }
    }
}
