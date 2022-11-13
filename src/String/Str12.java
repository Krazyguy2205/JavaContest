package String;

import java.util.Scanner;

public class Str12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		int cnt = 0;
		for(String str : arr) {
			if(str.equals(str.toUpperCase())) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
