package StringAdvanced;

import java.util.Scanner;

public class StrAdv6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int[] cnt1 = new int[256];
		int[] cnt2 = new int[256];
		for(char x : s1.toCharArray()) {
			cnt1[x] = 1;
		}
		
		for(char x : s2.toCharArray()) {
			cnt2[x] = 1;
		}
		
		for(int i = 0; i < 256; i++) {
			if(cnt1[i] == 1 && cnt2[i] == 0) {
				System.out.print((char)i);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < 256; i++) {
			if(cnt1[i] == 0 && cnt2[i] == 1) {
				System.out.print((char)i);
			}
		}
	}
}
