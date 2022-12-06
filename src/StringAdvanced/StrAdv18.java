package StringAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StrAdv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            ArrayList<String> aList = new ArrayList<>(Arrays.asList(arr));
            System.out.print(aList.get(aList.size() - 2).toLowerCase());
            for(int i = 0; i < aList.size() - 2; i++) {
                System.out.print(Character.toLowerCase(aList.get(i).charAt(0)));
            }
            System.out.println("@xyz.edu.vn");

            String[] arr2 = aList.get(aList.size() - 1).split("/");
            for(String x : arr2) {
                System.out.print(Integer.parseInt(x));
            }
            System.out.println();
        }
    }
}
