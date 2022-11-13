package FunctionAndNumberTheory;

import java.util.Scanner;

public class Func9 {
    static boolean prime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return n > 1;
	}

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		long n = sc.nextLong();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (prime(i)) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
