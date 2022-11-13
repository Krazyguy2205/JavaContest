package Array;

import java.util.Scanner;

//Tính trung bình cộng các số ngto trong mảng
public class Arr2 {
	static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return n > 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		double sum = 0, ans = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(isPrime(a[i])) {
				sum += a[i];
				++cnt;
			}
		}
		
		ans = sum / cnt;
		System.out.printf("%.3f", ans);
	}
}
