package LyThuyetSo;

import java.util.Scanner;

public class Fibonacci {
	//In ra so fibi thu n
	static long fibo(int n) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		long fn1 = 1, fn2 = 0, fn = 0;
		for(int i = 3; i <= n; i++) {
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
		}
		return fn;
	}
	//ktra 1 so co phai so fibo ko
	static boolean checkFibo(int n) {
		if(n == 0 || n == 1)
			return true;
		long fn1 = 1, fn2 = 0, fn = 0;
		for(int i = 3; i <= n; i++) {
			fn = fn1 + fn2;
			if(fn == n) {
				return true;
			}
			fn2 = fn1;
			fn1 = fn;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
		sc.close();
	}
}




















