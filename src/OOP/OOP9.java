package OOP;

import java.util.Scanner;

public class OOP9 {
    private String ma, hoTen;
    private int luongCoBan;

    public OOP9() {
        super();
    }

    public OOP9(String ma, String hoTen, int luongCoBan) {
        super();
        this.ma = ma;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        ma = sc.nextLine();
        hoTen = sc.nextLine();
        luongCoBan = sc.nextInt();
    }

    public static void main(String[] args) {
        OOP9 gv = new OOP9();
        gv.input();
        System.out.print(gv.getMa() + " " + gv .getHoTen() + " ");
        // gv.getHeSo();
        // gv.getSalary();
    }
}
