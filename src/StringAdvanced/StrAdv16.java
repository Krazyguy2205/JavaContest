package StringAdvanced;

import java.util.Scanner;

public class StrAdv16 {
    static void chuanHoaTen(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 1; i < x.length(); i++) {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 1));
        s = sb.toString();
        System.out.println(s);
    }

    static void chuanHoaNgaySinh(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }

        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        s = sb.toString();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngaySinh = sc.nextLine();
        chuanHoaTen(ten);
        chuanHoaNgaySinh(ngaySinh);
    }
}
