package String;

import java.util.Scanner;

public class Str14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		int cnt = 0;
		for(String x : arr) {
			if(x.equalsIgnoreCase("28tech")) 
				++cnt;
		}
		System.out.println(cnt);
	}
}
