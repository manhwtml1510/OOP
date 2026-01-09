package ON_THI_CK;
import java.util.*;

abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

interface Taxable {
    double calculateTax();
}

class FulltimeEmployee extends Employee implements Taxable {
    private int time;
    public FulltimeEmployee(String id, String name, double baseSalary, int time){
        super(id, name, baseSalary);
        this.time = time;    
    }
    @Override
    public double calculateSalary() {
        return time * baseSalary;
    }
    @Override
    public double calculateTax() {
        return calculateSalary() * 0.1;
    }
}

class PartTimeEmployee extends Employee {
    private int hours;
    public PartTimeEmployee(String id, String name, double baseSalary, int hours) {
        super(id, name, baseSalary);
        this.hours = hours;
    }
    
    @Override
    public double calculateSalary() {
        return hours * baseSalary;
    }
}

public class Cau2 {
    public static void main(String[] args) {
        double TotalTax = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FulltimeEmployee("12345","Nguyen Dinh Duc Manh", 200000, 5));
        employees.add(new PartTimeEmployee("12346", "Nguyen Viet Dat", 250000, 5));
        employees.add(new FulltimeEmployee("12347","Nguyen Hihihaha", 200000, 8));

        System.out.println("Bang luong nhan vien");
        for (Employee e : employees) {
            System.out.printf(
                "ID: %s, Name: %s, Salary: %,d VND%n",
                e.id, e.name, (long) e.calculateSalary()
            );
        }
        System.out.println("===============");
        System.out.println("Tong thue cua cong ty la: ");
        for (Employee e: employees) {
            if (e instanceof Taxable) {
                TotalTax += ((Taxable) e).calculateTax();
            }
        }
        System.out.printf("%,d VND%n", (long) TotalTax);
    }
}
