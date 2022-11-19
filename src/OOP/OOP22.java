package OOP;

import java.util.Scanner;

public class OOP22 {
    private String maSV, hoTen, ngaySinh, lop;
    private double gpa;

    public OOP22(int maSV, String hoTen, String ngaySinh, String lop, double gpa) {
        super();
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
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + this.gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OOP22[] arr = new OOP22[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            arr[i] = new OOP22(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            arr[i].chuanHoa();
        }

        for (OOP22 x : arr) {
            System.out.println(x);
        }
    }
}
