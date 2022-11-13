package String;

import java.util.Scanner;

///tìm kí tự được lặp lại đầu tiên trong xâu S
public class Str10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] cnt = new int[1001];
		for(char x : s.toCharArray()) {
			if(cnt[x] == 1) {
				System.out.println(x);
				return;
			} 
			cnt[x] = 1;
		}
		System.out.println("NONE");
	}
}
