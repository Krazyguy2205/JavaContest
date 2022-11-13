package StringAdvanced;

import java.util.Scanner;

public class StrAdv9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		System.out.println(arr.length);
	}
}
