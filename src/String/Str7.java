package String;

import java.util.Scanner;
//thực hiện tách riêng chữ số và chữ cái 
public class Str7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder character = new StringBuilder(), digit = new StringBuilder();
		for(int i = 0; i < s.length() - 1; i++) {
			if(Character.isDigit(s.charAt(i))) {
				digit.append(s.charAt(i));
			} else {
				character.append(s.charAt(i));
			}
		}
		
		System.out.println(digit + "\n" + character + "\n");
	}
}
