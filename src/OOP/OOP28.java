package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP28 {
    private String maSV;
    private final String hoTen;
    private final double Avg;

    public OOP28(int maSV, String hoTen, double Avg) {
        this.maSV = String.format("%02d", maSV);
        this.maSV = "HS" + this.maSV;
        this.hoTen = hoTen;
        this.Avg = Avg;
    }

    public double getAvg() {
        return this.Avg;
    }

    public String ranking() {
        if(getAvg() >= 9) return "XUAT XAC";
        if(getAvg() >= 8 && getAvg() < 9) return "GIOI";
        if(getAvg() >= 7 && getAvg() < 8) return "KHA";
        if(getAvg() >= 5 && getAvg() < 7) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + String.format("%.1f", getAvg()) + " " + ranking();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<OOP28> stuList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            double avg = 0;
            for(int j = 0; j < 10; j++) {
                double x = Double.parseDouble(sc.next());
                avg += x;
            }
            sc.nextLine();
            avg /= 10;
            OOP28 stu = new OOP28(i + 1, hoTen, avg);
            stuList.add(stu);
        }

        stuList.sort((o1, o2) -> {
            if (o1.getAvg() != o2.getAvg()) {
                if (o1.getAvg() > o2.getAvg())
                    return -1;
                return 1;
            }
            return o1.maSV.compareTo(o2.maSV);
        });

        for(OOP28 x : stuList) {
            System.out.println(x);
        }
    }
}
