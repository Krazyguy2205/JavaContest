package Array;

import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int minValue = Integer.MAX_VALUE, cnt = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < minValue) {
				minValue = Math.min(minValue, a[i]);
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i] == minValue)
				++cnt;
		}
		
		System.out.println(cnt);
	}
}
