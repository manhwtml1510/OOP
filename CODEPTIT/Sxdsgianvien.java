import java.util.*;
class GiangVien implements Comparable<GiangVien> {
    private String maGV;
    private String hoTen;
    private String tenVietTat;
    private String tenCuoi;

    public GiangVien(int id, String hoTen, String boMon) {
        this.maGV = String.format("GV%02d", id);
        this.hoTen = hoTen;
        this.tenVietTat = vietTatBoMon(boMon);
        this.tenCuoi = layTenCuoi(hoTen);
    }
    private String vietTatBoMon(String boMon) {
        String[] words = boMon.toUpperCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return sb.toString();
    }  
    private String layTenCuoi(String hoTen) {
        String[] words = hoTen.split(" ");
        return words[words.length - 1];
    }
    @Override
    public String toString() {
        return maGV + " " + hoTen + " " + tenVietTat;
    }
    @Override
    public int compareTo(GiangVien other) {
        int compareTen = this.tenCuoi.compareTo(other.tenCuoi);
        if (compareTen != 0) {
            return compareTen;
        }
        return this.maGV.compareTo(other.maGV);
    }
}

public class Sxdsgianvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); 
        List<GiangVien> danhSachGV = new ArrayList<>();  
        for (int i = 1; i <= n; i++) {
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            danhSachGV.add(new GiangVien(i, hoTen, boMon));
        }
        Collections.sort(danhSachGV);    
        for (GiangVien gv : danhSachGV) {
            System.out.println(gv);
        }     
        sc.close();
    }
}