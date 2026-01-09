package ON_THI_CK;
import java.util.*;

class InvalidGPAException extends Exception {
    public InvalidGPAException(String message) {
        super(message);
    }
}

abstract class Student1 {
    protected String id;
    protected String name;
    protected double gpa;

    public Student1(String id, String name, double gpa) throws InvalidGPAException {

        if (gpa <0 || gpa >4) {
            throw new InvalidGPAException("GPA phai lon hon 0 va nho hon 4 -> " + gpa + "?");
        }

        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public abstract double calculateTuition();
}

class ITStudent extends Student1 {
    private int So_TC;
    public ITStudent( String id, String name, double gpa, int So_TC )
            throws InvalidGPAException{
        super(id, name, gpa);
        this.So_TC = So_TC;
    }
    @Override
    public double calculateTuition() {
        return So_TC * 500000;
    }
}

class BusinessStudent extends Student1 {
    private int So_TC;
    public BusinessStudent(String id, String name, double gpa, int So_TC) 
            throws InvalidGPAException {
        super(id, name, gpa);
        this.So_TC = So_TC;
    }

    @Override 
    public double calculateTuition() {
        return So_TC * 300000;
    }
}

public class Cau4_1 {
    public static void main(String[] args) {
        try {
            ArrayList<Student1> students = new ArrayList<>();
            students.add(new ITStudent("12345", "Nguyen Dinh Duc Manh", 3.6, 121));
            students.add(new BusinessStudent("12346", "Nguyen Viet Dat", 3.6, 140));
            students.add(new ITStudent("12347", "Tran Dinh Nhan", 4.5, 121));

            System.out.println("Hoc phi cac hoc sinh: ");
            for (Student1 s : students) {
                System.out.printf( "%s; %s; %.2f; %,d VND.%n",
                s.id, s.name, s.gpa, (long) s.calculateTuition()
                );
            }

        } catch (InputMismatchException e) {
            System.out.println("Loi khi nhap thong tin sinh vien");
        } catch (InvalidGPAException e) {
            System.out.println("Loi GPA: " + e.getMessage());
        }
    }
}
