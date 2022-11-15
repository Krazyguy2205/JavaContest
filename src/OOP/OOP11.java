package OOP;

import java.util.Scanner;

public class OOP11 {
    private String maNV, hoTen, chucVu;
    private int luongCoBan, soNgayCong;

    public OOP11() {
        super();
    }

    public OOP11(int maNV, String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        super();
        this.maNV = String.format("%02d", maNV);
        this.maNV = "NV" + this.maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            hoTen = sc.nextLine();
            luongCoBan = Integer.parseInt(sc.nextLine());
            soNgayCong = Integer.parseInt(sc.nextLine());
            chucVu = sc.nextLine();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public int thuong() {
        if (getSoNgayCong() >= 25)
            return (int) (0.2 * luongThang());
        else if (getSoNgayCong() >= 22 && getSoNgayCong() < 25)
            return (int) (0.1 * luongThang());
        else
            return 0;
    }

    public int phuCap() {
        return switch (getChucVu()) {
            case "GD" -> 250000;
            case "PGD" -> 200000;
            case "TP" -> 180000;
            default -> 150000;
        };
    }

    public long luongThang() {
        return ((long) getLuongCoBan() * getSoNgayCong());
    }

    public long tongThuNhap() {
        return luongThang() + (long) thuong() + (long) phuCap();
    }

    @Override
    public String toString() {
        return "NV01" + " " + getHoTen() + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + tongThuNhap();
    }

    public static void main(String[] args) {
        OOP11 nv = new OOP11();
        nv.input();
        System.out.println(nv);
    }
}
