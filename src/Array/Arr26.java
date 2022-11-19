package Array;

import java.util.Scanner;

public class Arr26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		int[] mark = new int[1000007];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			mark[a[i]] = 1;
		}

		for (int j : mark) {
			if (j != 0)
				++cnt;
		}
		System.out.println(cnt);
	}
}
