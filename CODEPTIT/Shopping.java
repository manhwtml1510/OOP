import java.util.*;

abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price; 
    }
    public double getPrice() {
        return price;
    }
    public abstract void getInfo();
}

class Electronic extends Product {
    private String imei;
    private int baohanh;
    public Electronic(String id, String name, double price, String imei, int baohanh) {
        super(id, name, price);
        this.imei = imei;
        this.baohanh = baohanh;
    }
    @Override
    public void getInfo() {
        System.out.println("Đồ điện tử: " + name + ", Giá: "+price+", imei: "+imei + ", Bảo hành: " + baohanh + " tháng" );
    }
}
class Food extends Product {
    private String HSD;
    public Food(String id, String name, double price, String HSD) {
        super(id, name, price);
        this.HSD = HSD;
    }
    @Override
    public void getInfo() {
        System.out.println("Thực phẩm: " + name+ ", Giá: "+price+ ", Hạn sử dụng: " + HSD);
    }
}
interface Payment {
    void pay(double amount);
}
class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng tiền mặt: " + amount+ " VND. Thanh toán tiền mặt thành công");
    }
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount+ " VND. Thanh toán thẻ thành công");
    }
}
class MomoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng ví điện tử: " + amount+ " VND. Thanh toán qua ví điện tử thành công");
    }
}
class Order {
    private List<Product> products;
    private Payment payment;
    public Order() {
        products = new ArrayList<>();
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public double tongGia() {
        double tong = 0;
        for (Product p: products) {
            tong+= p.getPrice();
        }
        return tong;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void checkout() {
        double tong = tongGia();
        System.out.println("Tổng tiền đơn hàng: " + tong + "VND");
        payment.pay(tong);
    }
    public void showProducts() {
        System.out.println("\nDanh sách sản phẩm có trong đơn hàng gồm:");
        for (Product p: products) {
            p.getInfo();
        }
    }
}


public class Shopping {
    public static void main(String[] args) {
        Product p1 = new Electronic("E1", "Laptop", 20000000, "IMEI123", 24);
        Product p2 = new Food("F1", "Bánh quy", 50000, "10/2025");
        Product p3 = new Electronic("E2", "Tai nghe", 1500000, "IMEI124", 12);
        Product p4 = new Food("F2", "Matcha Latte", 55000, "09/10/2025");
        Product p5 = new Food("F3", "Bánh matcha", 100000, "10/10/2025");
        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);
        order.addProduct(p4);
        order.addProduct(p5);

        order.showProducts();

        Payment payment = new CashPayment();

        order.setPayment(payment);
        order.checkout();
    }
}
