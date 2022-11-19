package OOP;

import java.util.Scanner;

public class OOP12 {
    private String ma, hoTen;
    private double toan, ly, hoa;

    public OOP12() {
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

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        ma = sc.nextLine();
        hoTen = sc.nextLine();
        toan = Double.parseDouble(sc.nextLine());
        ly = Double.parseDouble(sc.nextLine());
        hoa = Double.parseDouble(sc.nextLine());
    }

    public String getStatus() {
        if(getDiem() < 24) return "TRUOT";
        else return "TRUNG TUYEN";
    }

    public int getKV() {
        if(getMa().charAt(2) == '2') return 2;
        else if(getMa().charAt(2) == '1') return 1;
        else return 3;
    }

    public double getDiemUuTien() {
        return switch (getKV()) {
            case 1 -> 0.5;
            case 2 -> 1.0;
            default -> 2.5;
        };
    }

    public double getDiem() {
        return getToan() + getLy() + getHoa() + getDiemUuTien();
    }

    public String getFormat() {
        if(getDiem() == (int)(getDiem()))
            return String.valueOf((int)(getDiem()));
        return String.format("%.1f", getDiem());
    }

    @Override
    public String toString() {
        return getMa() + " " + getHoTen() + " " + getKV() + " " + getFormat() + " " + getStatus();
    }

    public static void main(String[] args) {
        OOP12 ts = new OOP12();
        ts.input();
        System.out.println(ts);
    }
}
