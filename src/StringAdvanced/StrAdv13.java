package StringAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StrAdv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        TreeMap<String, Integer> strMap = new TreeMap<>();
        LinkedHashMap<String, Integer> strMap2 = new LinkedHashMap<>();
        for(String x : arr) {
            if(strMap.containsKey(x)) {
                int tanSuat = strMap.get(x);
                ++tanSuat;
                strMap.put(x, tanSuat);
                strMap2.put(x, tanSuat);
            } else {
                strMap.put(x, 1);
                strMap2.put(x, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            String mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            System.out.println(mapKey + " " + mapValue);
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : strMap2.entrySet()) {
            String mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            System.out.println(mapKey + " " + mapValue);
        }
    }
}
