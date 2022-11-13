package String;

import java.util.HashSet;
import java.util.Scanner;

public class Str19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<String> hs = new HashSet<>();
		String[] arr = s.toLowerCase().split("\\s+");
		for(String x : arr) {
			hs.add(x);
		}
		
		System.out.println(hs.size());
	}
}
