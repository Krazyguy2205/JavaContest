package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OOP30 {
    private String maSV, hoTen, lop, email;

    public OOP30(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return this.maSV;
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<OOP30> arr = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            arr.add(new OOP30(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        arr.sort(Comparator.comparing(OOP30::getMaSV));

        for(OOP30 x : arr) {
            System.out.println(x);
        }
    }
}
