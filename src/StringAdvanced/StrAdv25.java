package StringAdvanced;

import java.util.Scanner;

public class StrAdv25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int[] minV = new int[m];
        int[] maxV = new int[m];
        if (m * 9 < s || (s == 0 && m >= 2)) {
            System.out.println("NOT FOUND");
        } else {
            int tmp = s;
            for (int i = 0; i < m; i++) {
                if (s >= 9) {
                    maxV[i] = 9;
                    s -= 9;
                } else {
                    maxV[i] = s;
                    s = 0;
                }
            }
            --tmp;
            for (int i = m - 1; i > 0; i--) {
                if(tmp >= 9) {
                    minV[i] = 9;
                    tmp -= 9;
                } else {
                    minV[i] = tmp;
                    tmp = 0;
                }
            }
            minV[0] = tmp + 1;

            for(int i = 0; i < m; i++) {
                System.out.print(minV[i]);
            }

            System.out.println();

            for(int i = 0; i < m; i++) {
                System.out.print(maxV[i]);
            }
        }
    }
}
