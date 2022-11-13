package Array;

import java.util.Scanner;

public class Arr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt  = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(i % 2 == 0 && a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
				++cnt;
			}
		}
		if(cnt == 0)
			System.out.println("NONE");
		
	}
}
