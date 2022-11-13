package Array;

import java.util.Scanner;

public class Arr6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int sum = a[i] + a[j];
				if(sum == k)
					++cnt;
			}
		}
		System.out.println(cnt);
	}
}
