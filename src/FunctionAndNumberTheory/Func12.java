package FunctionAndNumberTheory;

import java.util.Scanner;

//Phân tích thừa số nguyên tố
public class Func12 {
    static void factoringPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					System.out.println(i + " ");
					n /= i;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factoringPrime(n);
	}
}
