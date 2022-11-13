package String;

import java.util.Scanner;

public class Str2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder reverse = new StringBuilder();
		reverse.append(s);
		reverse.reverse();
		System.out.println(reverse + "\n" + s.toLowerCase() +"\n" + s.toUpperCase());
	}
}
