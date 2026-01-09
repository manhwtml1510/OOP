import java.util.*;
class Tongps {
    private long tu;
    private long mau;

    public Tongps(long tu, long mau) {
        this.tu=tu;
        this.mau= mau;
        rutGon();
    }

    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }

    private void rutGon() {
        long g = gcd(Math.abs(tu), Math.abs(mau));
        tu /= g;
        mau /= g;
    }

    public Tongps cong(Tongps other) {
        long tuMoi = this.tu * other.mau + other.tu * this.mau;
        long mauMoi = this.mau * other.mau;
        return new Tongps(tuMoi, mauMoi);
    }

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong(), mau1 = sc.nextLong();
        long tu2 = sc.nextLong(), mau2 = sc.nextLong();
        Tongps p = new Tongps(tu1, mau1);
        Tongps q = new Tongps(tu2, mau2);

        Tongps tong = p.cong(q);
        tong.hienThi();
        sc.close();
    }
}