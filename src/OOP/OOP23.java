package OOP;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP23 {
    private String maSV, hoTen, ngaySinh, lop;
    private double gpa;

    public OOP23(int maSV, String hoTen, String ngaySinh, String lop, double gpa) {
        this.maSV = String.format("%03d", maSV);
        this.maSV = "SV" + this.maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    public void chuanHoa() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }

        if(sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }

        this.ngaySinh = sb.toString();

        String[] arr = this.hoTen.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String x : arr) {
            res.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 0; i < x.length(); i++) {
                res.append(Character.toLowerCase(x.charAt(i)));
            }
            res.append(" ");
        }
        res = new StringBuilder(res.substring(0, res.length() - 1));
        this.hoTen = res.toString();
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }

    public void out() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<OOP23> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            OOP23 stu = new OOP23(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            stu.chuanHoa();
            arr.add(stu);
        }

        for (OOP23 oop23 : arr) {
            oop23.out();
        }
    }
}
