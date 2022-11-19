package FunctionAndNumberTheory;

import java.util.Scanner;
//Số thuần nguyên tố
//là 1 số nguyên tố
//tất cả các chữ số là snt
//tổng tất cả các chữ số là 1 số nguyên tố
public class Func6 {
    static boolean prime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return n > 1;
	}

	static boolean checkDigit(int n) {
		int sum = 0;
		while(n != 0) {
			int r = n % 10;
			if(r != 2 && r != 3 && r != 5 && r != 7)
				return false;
			sum += r;
			n /= 10;
		}
		return prime(sum);
	}

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
