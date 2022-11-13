package String;

import java.util.Scanner;

//TÌm chũ số đứng giữa
public class Str1 {
	static void middleChar(String s) {
		if(s.length() % 2 != 0) {
			System.out.println(s.charAt(s.length() / 2));
		} else {
			System.out.println("NOT FOUND");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		middleChar(s);
		sc.close();
	}
}
