package StringAdvanced;

import java.util.*;

public class StrAdv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = s.toLowerCase();
        t = t.toLowerCase();
        TreeMap<String, Integer> m = new TreeMap<>();
        String[] arr1 = s.split("\\s+");
        String[] arr2 = t.split("\\s+");

        for(String x : arr1) {
            m.put(x, 1);
        }

        for(String x : arr2) {
            if(m.containsKey(x)) {
                if(m.get(x) == 1) {
                    m.put(x, 2);
                }
            }
        }

        Set<Map.Entry<String, Integer>> set = m.entrySet();
        for(Map.Entry<String, Integer> x : set) {
            if(x.getValue() == 2)
                System.out.print(x.getKey() + " ");
        }
    }
}
