package StringAdvanced;

import java.util.Scanner;

public class StrAdv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String python = "python";
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == python.charAt(cnt)) {
                cnt++;
            }
        }
        if (cnt == python.length() - 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
