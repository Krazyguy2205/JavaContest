package StringAdvanced;

import java.util.Scanner;

public class StrAdv3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] mark = new int[1001];
		for(char x : s.toCharArray()) {
			++mark[x];
		}
		
		for(int i = 0; i < 256; i++) {
			if(mark[i] != 0) {
				System.out.println((char)i + " " + mark[i]);
			}
		}
		
		System.out.println();
		
		for(char x : s.toCharArray()) {
			if(mark[x] != 0) {
				System.out.println(x + " " + mark[x]);
				mark[x] = 0;
			}
		}
	}
}
