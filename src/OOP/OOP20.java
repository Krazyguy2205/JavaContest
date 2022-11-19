package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//Giá trị độ đo thời gian được biểu diễn bởi ba thành phần: giờ, phút, giây
//Cho N giá trị thời gian, hãy sắp xếp danh sách theo thứ tự tăng dần
public class OOP20 {
    private int gio, phut, giay;

    public OOP20(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGiay() {
        return this.gio * 3600 + this.phut * 60 + this.giay;
    }

    @Override
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<OOP20> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new OOP20(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        arr.sort((o1, o2) -> o1.getGiay() - o2.getGiay());
        for(OOP20 x : arr) {
            System.out.println(x);
        }
    }
}
