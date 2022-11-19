package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class OOP21 {
    private String maHang, tenMatHang, donViTinh;
    private int giaMua, giaBan;

    public OOP21(int maHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        super();
        this.maHang = String.format("%04d", maHang);
        this.maHang = "MH" + this.maHang;
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return getGiaBan() - getGiaMua();
    }

    @Override
    public String toString() {
        return this.maHang + " " + getTenMatHang() + " " + getDonViTinh() + " " + getGiaMua() + " " + getGiaBan() + " " + getLoiNhuan();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        OOP21[] arr = new OOP21[m];
        for (int i = 0; i < m; i++) {
            arr[i] = new OOP21(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr, (o1, o2) -> o2.getLoiNhuan() - o1.getLoiNhuan());
        for (OOP21 x : arr) {
            System.out.println(x);
        }
    }
}
