package OOP2;

public class Vehicle {
    private String maXe, tenXe, hang, mauSac;

    public Vehicle() {
    }

    public Vehicle(String maXe, String tenXe, String hang, String mauSac) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hang = hang;
        this.mauSac = mauSac;
    }

    public String getMaXe() {
        return maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getHang() {
        return hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    @Override
    public String toString() {
        return getMaXe() + " " + getTenXe() + " " + getHang() + " " + getMauSac();
    }
}
