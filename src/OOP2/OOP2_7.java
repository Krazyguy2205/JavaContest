package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class car extends Vehicle {
    private final int maLuc;
    private final int giaBan;

    public car(String maXe, String tenXe, String hang, String mauSac, int maLuc, int giaBan) {
        super(maXe, tenXe, hang, mauSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
    }

    public int getMaLuc() {
        return maLuc;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMaLuc() + " " + getGiaBan();
    }
}

class bike extends Vehicle {
    private final int giaban;
    private final int tocDo;

    public bike(String maXe, String tenXe, String hang, String mauSac, int tocDo, int giaban) {
        super(maXe, tenXe, hang, mauSac);
        this.giaban = giaban;
        this.tocDo = tocDo;
    }

    public int getTocDo() {
        return tocDo;
    }

    public int getGiaBanXe() {
        return giaban;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getTocDo() + " " + getGiaBanXe();
    }
}

public class OOP2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<car> oto = new ArrayList<>();
        ArrayList<bike> xm = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.contains("OTO")) {
                String tenXe = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int maLuc = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                car o = new car(ma, tenXe, hang, mau, maLuc, giaBan);
                oto.add(o);
            }

            if (ma.contains("XM")) {
                String tenXe = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int tocDo = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                bike b = new bike(ma, tenXe, hang, mau, tocDo, giaBan);
                xm.add(b);
            }
        }

        String findName = sc.nextLine();

        System.out.println("DANH SACH OTO :");
        for (car x : oto) {
            if(x.getTenXe().equals(findName)) {
                System.out.println(x);
            }
        }

        System.out.println("DANH SACH XE MAY :");
        for (bike x : xm) {
            if(x.getTenXe().equals(findName)) {
                System.out.println(x);
            }
        }
    }
}
