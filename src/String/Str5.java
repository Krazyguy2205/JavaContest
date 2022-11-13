package String;

import java.util.Scanner;

public class Str5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		int cnt = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			++cnt;
			res += s.charAt(i);
			if(cnt % 3 == 0 && i != 0) {
				res += ",";
			}
		}
		
		for(int i = res.length() - 1; i >= 0; i--) {
			System.out.print(res.charAt(i));
		}
	}
}
