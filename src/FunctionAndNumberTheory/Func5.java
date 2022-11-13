package FunctionAndNumberTheory;

import java.util.Scanner;

public class Func5 {
    static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 2; i <= n / 2; i++) {
                if (prime(i) && prime(n - i)) {
                    System.out.println(i + " " + (n - i));
                }
            }
        }
    }
}
