package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien extends Person {
    private String maSV, lop;
    private double gpa;

    public SinhVien(String maSV, String name, String ngaySinh, String diaChi, String lop, double gpa) {
        super(name, ngaySinh, diaChi);
        this.maSV = maSV;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return getMaSV() + " " + super.toString() + " " + getLop() + " " + String.format("%.2f", getGpa());
    }
}

class GiaoVien extends Person {
    private String maGV, khoa, lop;
    private int luong;

    public GiaoVien(String maGV, String name, String ngaySinh, String diaChi, String khoa,  int luong, String lop) {
        super(name, ngaySinh, diaChi);
        this.maGV = maGV;
        this.khoa = khoa;
        this.lop = lop;
        this.luong = luong;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getLop() {
        return lop;
    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return getMaGV() + " " + super.toString() + " " + getKhoa() + " " + getLuong() + " " + getLop();
    }
}

public class OOP2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoVien> gv = new ArrayList<>();
        ArrayList<SinhVien> sv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if(ma.contains("GV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());
                String lop = sc.nextLine();
                GiaoVien t = new GiaoVien(ma, ten, ngaySinh, diaChi, khoa, luong, lop);
                t.chuanHoa();
                gv.add(t);
            }

            if(ma.contains("SV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                SinhVien s = new SinhVien(ma, ten, ngaySinh, diaChi, lop, gpa);
                s.chuanHoa();
                sv.add(s);
            }
        }
        String lop = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + lop + " :");
        for(GiaoVien x : gv) {
            if(x.getLop().equals(lop))
                System.out.println(x);
        }

        System.out.println("DANH SACH SINH VIEN LOP " + lop + " :");
        for(SinhVien x : sv) {
            if(x.getLop().equals(lop)) {
                System.out.println(x);
            }
        }
    }
}
