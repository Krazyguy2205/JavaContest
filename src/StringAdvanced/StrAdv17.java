package StringAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StrAdv17 {
    static String chuanHoaTen(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++) {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        ArrayList<String> aList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < aList.size() - 1; i++) {
            System.out.print(chuanHoaTen(aList.get(i)));
            if (i < aList.size() - 2)
                System.out.print(" ");
        }
        System.out.println(", " + aList.get(aList.size() - 1).toUpperCase());

        System.out.print(aList.get(aList.size() - 1).toUpperCase() + ", ");
        for (int i = 0; i < aList.size() - 1; i++) {
            System.out.print(chuanHoaTen(aList.get(i)));
            if (i < aList.size() - 2)
                System.out.print(" ");
        }
    }
}
