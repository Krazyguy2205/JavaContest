package Array;

import java.util.Scanner;

public class Arr10 {
	static boolean isPrime(int n) {
		for(int i = 2; i < Math.sqrt(n); i++) {
			return false;
		}
		return n > 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int left = 0, right = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			//i[0, i - 1], [i + 1, n - 1]
			for(int j = 0; j < i; j++) {
				left += a[j];
			}
			
			for(int j = i + 1; j < n; j++) {
				right += a[j];
			}
			
			if(isPrime(left) && isPrime(right)) {
				System.out.print(i + " ");
			}
		}
	}
}
