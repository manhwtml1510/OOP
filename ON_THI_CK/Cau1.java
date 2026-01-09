package ON_THI_CK;
import java.util.*;
import java.io.*;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public String toFileString() {
        return id + ";" + name + ";" + gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class Cau1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        
        if (n<5) {
            System.out.println("So luong sinh vien >=5");
            return;
        }
        for (int i = 0; i<n ; i++) {
            System.out.println("Nhap sinh vien thu" + (i+1));
            System.out.println("ID: ");
            String id = sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(id, name, gpa));
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            for (Student s: students) {
                bw.write(s.toFileString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Loi khi ghi");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null ) {
                String[] parts = line.split(";");
                String id = parts[0];
                String name = parts[1];
                double gpa = Double.parseDouble(parts[2]);
                
                Student s = new Student(id, name, gpa);
                System.out.println(s);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Loi khi doc");
        }

        sc.close();
    }
}
