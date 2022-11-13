package Array;

import java.util.Scanner;

public class Arr7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int minV = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				minV = Math.min(minV, Math.abs(a[i] - a[j]));
			}
		}
		
		System.out.println(minV);
	}
}
