package FunctionAndNumberTheory;

import java.util.Scanner;
//Liệt kê các số có đúng 3 ước không vượt quá n
public class Func8 {
    static boolean prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return n > 1;
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (prime(i)) {
				System.out.print((long) i * i + " ");
			}
		}
	}
}
