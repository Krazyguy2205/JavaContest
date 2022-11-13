package String;

import java.util.Scanner;

//một số được coi là số đẹp nếu 2 chữ số liền kề của nó chỉ lệch nhau đúng 1 đơn vị
public class Str4 {
	static boolean checkStr(String s) {
		for(int i = 0; i < s.length() - 1; i++) {
			if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(checkStr(s))
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}
