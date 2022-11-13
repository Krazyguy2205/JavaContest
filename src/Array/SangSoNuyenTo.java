package Array;

import java.util.Scanner;

//Sàng số nguyên tố eratosthenes
public class SangSoNuyenTo {
    static boolean[] p = new boolean[1000001];
    // p[i] == true -> p[i] la so nguyen to

    static void sang() {
        for (int i = 0; i < 1000001; i++) {
            // coi tat ca cac so la snt
            p[i] = true;
        }
        p[0] = false;
        p[1] = false;

        for (int i = 2; i <= Math.sqrt(1000001); i++) {
            // neu i la snt
            if (p[i]) {
                // xet cac boi cua i
                for (int j = i * i; j <= Math.sqrt(1000001); j += i) {
                    p[j] = false;
                }
            }
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sang();
        for (int i = 0; i < n; i++) {
            if (p[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
