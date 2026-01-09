import java.util.*;

public class Baitoantuyensinh {

    public static double layDiemUuTien(String maThiSinh) {
        String khuVuc = maThiSinh.substring(0, 3);

        switch (khuVuc) {
            case "KV1":
                return 0.5;
            case "KV2":
            case "KV2A":
                return 1.0;
            case "KV3":
                return 2.5;
            default:
                return 0.0;
        }
    }

    public static String formatScore(double x) {
        if (x == (int)x) return String.valueOf((int)x);
        return String.format("%.1f", x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String maThiSinh = sc.nextLine();
        String hoTen = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();
        sc.close();

        final double DIEM_CHUAN = 24.0;

        double diemUuTien = layDiemUuTien(maThiSinh);
        double tongDiemKhongUuTien = diemToan * 2 + diemLy + diemHoa;
        double tongDiemCuoiCung = tongDiemKhongUuTien + diemUuTien;
        String trangThai = (tongDiemCuoiCung >= DIEM_CHUAN) ? "TRUNG TUYEN" : "TRUOT";
        System.out.println(
            maThiSinh + " " + hoTen + " " +
            formatScore(diemUuTien) + " " +
            formatScore(tongDiemKhongUuTien) + " " +
            trangThai
        );
    }
}
