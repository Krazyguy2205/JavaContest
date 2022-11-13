package String;

import java.util.Scanner;

public class Str9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), insertStr = "28tech";
		int index = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.insert(index, insertStr);
		System.out.println(sb.toString());
	}
}
