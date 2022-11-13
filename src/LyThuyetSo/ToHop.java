package LyThuyetSo;

import java.util.Scanner;

public class ToHop {
	static long toHop(int n, int k) {
		long res = 1;
		k = Math.min(k, n - k);
		for(int i = 1; i <= k; i++) {
			res *= (n - i + 1);
			res /= i;
		}
		return res;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(toHop(n, k));
	}
}	
