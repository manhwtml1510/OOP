import java.util.*;
class Thisinh {
    private String Name;
    private String Date;
    private float scr1, scr2, scr3;
    public Thisinh(String Name, String Date, float scr1, float scr2, float scr3) {
        this.Name = Name;
        this.Date = Date;
        this.scr1 = scr1;
        this.scr2 = scr2;
        this.scr3 = scr3;
    }
    public float Total() {
        return scr1 + scr2 + scr3;
    }
    public void Hienthi() {
        System.out.printf("%s %s %.1f ", Name, Date, Total());
    }
}
public class Lopthisinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Date = sc.nextLine();
        float scr1 = sc.nextFloat();
        float scr2 = sc.nextFloat();
        float scr3 = sc.nextFloat();
        Thisinh stu = new Thisinh(Name, Date, scr1, scr2, scr3);
        stu.Hienthi();
        sc.close();
    }
}