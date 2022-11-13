package String;

import java.util.Scanner;

public class Str7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String digit = "", alpha = "";
		for(char value : ch) {
			if(Character.isDigit(value)) {
				digit += value;
			} else {
				alpha += value;
			}
		}
		System.out.println(digit + "\n" + alpha + "\n");
	}
}
