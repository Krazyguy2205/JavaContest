package FunctionAndNumberTheory;

import java.util.Scanner;

//In ra ước số nguyên tố nhỏ nhất cảu các số từ 1 đến N
public class Func11 {
    static boolean prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return n > 1;
	}

	static int uocNto(int n) {
		if (n == 1) {
			return 1;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return i;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}
}
