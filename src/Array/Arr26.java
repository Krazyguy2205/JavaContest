package Array;

import java.util.Scanner;

public class Arr26 {
	@SuppressWarnings("resource")
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
		
		for(int i = 0; i < mark.length; i++) {
			if(mark[i] != 0)
				++cnt;
		}
		System.out.println(cnt);
	}
}
