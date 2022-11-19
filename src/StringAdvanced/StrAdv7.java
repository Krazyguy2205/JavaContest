package StringAdvanced;

import java.util.Scanner;

public class StrAdv7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder rev = new StringBuilder();
		
		for(int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}
		
		if(s.equals(rev.toString()))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
