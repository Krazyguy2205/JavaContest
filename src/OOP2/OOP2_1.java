package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP2_1 extends Person{
    private final String maSV;
    private final String lop;
    private final double gpa;

    public OOP2_1(int maSV, String name, String ngaySinh, String diaChi, String lop, double gpa) {
        super(name, ngaySinh, diaChi);
        this.maSV = String.format("%04d", maSV);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSV + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<OOP2_1> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String s = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            StringBuilder ngaySinh = new StringBuilder();
            StringBuilder diaChi = new StringBuilder();
            for(char x : s.toCharArray()) {
                if(!Character.isAlphabetic(x))
                    ngaySinh.append(x);
                else
                    diaChi.append(x);
            }

            OOP2_1 sv = new OOP2_1(i + 1, name, ngaySinh.toString(), diaChi.toString(), lop, gpa);
            sv.chuanHoa();
            arr.add(sv);
        }

        for(OOP2_1 x : arr) {
            System.out.println(x);
        }
    }
}
