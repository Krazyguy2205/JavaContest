package StringAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StrAdv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String x : arr) {
            if(map.containsKey(x)) {
                int tanSuat = map.get(x);
                ++tanSuat;
                map.put(x, tanSuat);
            } else {
                map.put(x, 1);
            }
        }
        int minFre = Integer.MAX_VALUE;
        int maxFre = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            if(mapValue > maxFre) {
                maxFre = mapValue;
                System.out.println(mapKey + " " + maxFre);
            }
        }
    }
}
