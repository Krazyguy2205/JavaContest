package StringAdvanced;

import java.util.Scanner;

public class StrAdv1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cntAplha = 0, cntDigit = 0, cntSpec = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)))
				++cntAplha;
			else if(Character.isDigit(s.charAt(i)))
				++cntDigit;
			else 
				++cntSpec;
		}
		
		System.out.println(cntAplha + " " + cntDigit + " " + cntSpec);
	}
}
