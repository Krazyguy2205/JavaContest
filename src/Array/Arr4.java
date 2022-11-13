package Array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int cntMin = 0, cntMax = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] > x) 
				++cntMax;
			
			if(a[i] < x) 
				++cntMin;
		}
		
		System.out.println(cntMin + "\n" + cntMax);
	}
}
