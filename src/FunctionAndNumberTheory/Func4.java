package FunctionAndNumberTheory;

import java.util.Scanner;

public class Func4 {
    static boolean prime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return n > 1;
	}

	static boolean checkDigit(int n) {
		while(n != 0) {
			int r = n % 10;
			if(r != 2 && r != 3 && r != 5 && r != 7)
				return false;
			n /= 10;
		}
		return true;
	}

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++) {
			if(checkDigit(i) && prime(i)) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
