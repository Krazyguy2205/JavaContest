package String;

import java.util.Scanner;

//Tính ttoongr chữ số xuất hiện trong xâu
public class Str3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int sumDigit = 0;
		for(char value : c) {
			if(Character.isDigit(value)) {
				int a = Integer.parseInt(String.valueOf(value));
				sumDigit += a;
			}
		}
		System.out.println(sumDigit);
	}
}
