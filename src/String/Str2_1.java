package String;

import java.util.Scanner;

public class Str2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), reverseStr = "";
		char ch;
		for(int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			reverseStr = ch + reverseStr;
		}
		
		System.out.println(reverseStr + "\n" + s.toLowerCase() + "\n" + s.toUpperCase());
	}
}
