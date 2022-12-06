package StringAdvanced;

import java.util.*;

public class StrAdv12 {
    static boolean checkReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        ArrayList<String> aList = new ArrayList<>();
        HashSet<String> setList = new HashSet<>();
        for(String x : arr) {
            if(checkReverse(x) && !setList.contains(x)) {
                aList.add(x);
                setList.add(x);
            }
        }

        aList.sort(Comparator.comparingInt(String::length));

        for(String x : aList) {
            System.out.print(x + " ");
        }
    }
}
