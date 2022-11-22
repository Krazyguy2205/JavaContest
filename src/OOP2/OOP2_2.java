package OOP2;

import java.util.*;

public class OOP2_2 extends Person{
    private final String maSV;
    private final String lop;
    private final double gpa;

    public OOP2_2(int maSV, String name, String ngaySinh, String diaChi, String lop, double gpa) {
        super(name, ngaySinh, diaChi);
        this.maSV = String.format("%04d", maSV);
        this.lop = lop;
        this.gpa = gpa;
    }

    public String sortName() {
        String[] arr = getName().split("\\s+");
        StringBuilder res = new StringBuilder(arr[arr.length - 1]);
        for(int i = 0; i < arr.length - 1; i++) {
            res.append(arr[i]).append(" ");
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return this.maSV + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<OOP2_2> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            OOP2_2 sv = new OOP2_2(i + 1, name, ngaySinh, diaChi, lop, gpa);
            sv.chuanHoa();
            arr.add(sv);
        }

        arr.sort(Comparator.comparing(OOP2_2::sortName));

        for(OOP2_2 x : arr) {
            System.out.println(x);
        }
    }
}
