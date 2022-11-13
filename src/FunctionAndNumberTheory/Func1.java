package FunctionAndNumberTheory;

import java.util.Scanner;

public class Func1 {
    static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}
