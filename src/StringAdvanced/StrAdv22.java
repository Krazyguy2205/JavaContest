package StringAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StrAdv22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String t = sc.nextLine();
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
            if(x.getValue() == 1)
                System.out.print(x.getKey() + " ");
        }
    }
}
