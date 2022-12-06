package StringAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class StrAdv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        Arrays.sort(arr, (o1, o2) -> {
            String a = o1 + o2;
            String b = o2 + o1;
            return b.compareTo(a);
        });
        for(String x : arr) {
            System.out.print(x);
        }
    }
}
