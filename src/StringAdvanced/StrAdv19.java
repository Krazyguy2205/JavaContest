package StringAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StrAdv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        while(n-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            ArrayList<String> aList = new ArrayList<>(Arrays.asList(arr));
            StringBuilder tmp = new StringBuilder();
            tmp.append(aList.get(aList.size() - 2).toLowerCase());
            for(int i = 0; i < aList.size() - 2; i++) {
                tmp.append(Character.toLowerCase(aList.get(i).charAt(0)));
            }
            String newS = tmp.toString();
            if(map.containsKey(newS)) {
                int tanSuat = map.get(newS);
                ++tanSuat;
                map.put(newS, tanSuat);
                System.out.println(newS + tanSuat + "@xyz.edu.vn");

            } else {
                map.put(newS, 1);
                System.out.println(tmp + "@xyz.edu.vn");
            }

            String[] arr2 = aList.get(aList.size() - 1).split("/");
            for(String x : arr2) {
                System.out.print(Integer.parseInt(x));
            }
            System.out.println();
        }
    }
}
