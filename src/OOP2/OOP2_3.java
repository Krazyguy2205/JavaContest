package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class Student extends Person2 {
    private final String lop;
    private final double gpa;

    public Student(String ma, String name, String ngaySinh, String diaChi, String lop, double gpa) {
        super(ma, name, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getLop() + " " + String.format("%.2f", getGpa());
    }
}

class Teacher extends Person2 {
    private final String khoa;
    private final int luong;

    public Teacher(String ma, String name, String ngaySinh, String diaChi, String khoa, int luong) {
        super(ma, name, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }

    public String getKhoa() {
        return khoa;
    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getKhoa() + " " + getLuong();
    }
}

public class OOP2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sv = new ArrayList<>();
        ArrayList<Teacher> gv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            if(ma.contains("GV")) {
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());
                Teacher t = new Teacher(ma, ten, ngaySinh, diaChi, khoa, luong);
                t.chuanHoa();
                gv.add(t);
                gv.sort((o1, o2) -> {
                   if(o1.getLuong() != o2.getLuong())
                       return o2.getLuong() - o1.getLuong();
                   else
                       return o1.getMa().compareTo(o2.getMa());
                });
            }

            if(ma.contains("SV")) {
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                Student s = new Student(ma, ten, ngaySinh, diaChi, lop, gpa);
                s.chuanHoa();
                sv.add(s);
                sv.sort((o1, o2) -> {
                   if(o1.getGpa() != o2.getGpa()) {
                       if (o1.getGpa() > o2.getGpa()) return -1;
                       return 1;
                   } else {
                       return o1.getMa().compareTo(o2.getMa());
                   }
                });
            }
        }

        System.out.println("DANH SACH GIAO VIEN : ");
        for(Teacher t : gv) {
            System.out.println(t);
        }

        System.out.println("DANH SACH SINH VIEN : ");
        for(Student s : sv) {
            System.out.println(s);
        }
    }
}
