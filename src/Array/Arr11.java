package Array;

import java.util.Scanner;

public class Arr11 {
    static long[] Fibo = new long[100];

    static boolean checkFibo(long n) {
        for(int i = 0; i <= 92; i++) {
            if(Fibo[i] == n)
                return true;
        }
        return false;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo[0] = 0;
        Fibo[1] = 1;
        for(int i = 2; i <= 92; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }

        int n = sc.nextInt();
        long[] a = new long[n];
        boolean check = false;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for(int i = 0; i < n; i++) {
            if(checkFibo(a[i])) {
                System.out.print(a[i] + " ");
                check = true;
            }
        }

        if(check == false) {
            System.out.println("NONE");
        }
    }
}
