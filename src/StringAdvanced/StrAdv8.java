package StringAdvanced;

import java.util.Scanner;

public class StrAdv8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("", "").toLowerCase();
		StringBuilder res = new StringBuilder();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s.indexOf(ch) != -1)
				res.append(ch);
		}

		if (res.length() == 26)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
