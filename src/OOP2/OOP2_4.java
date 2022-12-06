package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class GiangVien extends Person2 {
    String khoa, lop;
    int luong;

    public GiangVien(String ma, String name, String ngaySinh, String diaChi, String khoa, int luong, String lop) {
        super(ma, name, ngaySinh, diaChi);
        this.khoa = khoa;
        this.lop = lop;
        this.luong = luong;
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
        return super.toString() + " " + getKhoa() + " " + getLuong();
    }
}

class HocSinh extends Person2 {
    String lop;
    double gpa;

    public HocSinh(String ma, String name, String ngaySinh, String diaChi, String lop, double gpa) {
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

public class OOP2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> gv = new ArrayList<>();
        ArrayList<HocSinh> hs = new ArrayList<>();
        while(n-- > 0) {
            String ma = sc.nextLine();
            if(ma.contains("GV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());
                String lop = sc.nextLine();
                GiangVien g = new GiangVien(ma, ten, ngaySinh, diaChi, khoa, luong, lop);
                g.chuanHoa();
                gv.add(g);
            }

            if(ma.contains("SV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                HocSinh h = new HocSinh(ma, ten, ngaySinh, diaChi, lop, gpa);
                h.chuanHoa();
                hs.add(h);
            }
        }

        String diaChi = sc.nextLine();

        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + diaChi + " :");
        for(GiangVien g : gv) {
            if(g.getDiaChi().equals(diaChi)) {
                System.out.println(g);
            }
        }

        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + diaChi + " :");
        for(HocSinh h : hs) {
            if(h.getDiaChi().equals(diaChi)) {
                System.out.println(h);
            }
        }
    }
}
