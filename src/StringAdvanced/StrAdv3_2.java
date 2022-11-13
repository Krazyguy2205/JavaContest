package StringAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StrAdv3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(map1.containsKey(x)) {
				int tanSuat = map1.get(x);
				++tanSuat;
				map1.put(x, tanSuat);
			} else {
				map1.put(x, 1);
			}
		}
		
		TreeMap<Character, Integer> map2 = new TreeMap<>();
		map2.putAll(map1);
		for(Map.Entry<Character, Integer> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
