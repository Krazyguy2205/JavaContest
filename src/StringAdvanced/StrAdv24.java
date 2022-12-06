package StringAdvanced;

import java.util.Scanner;

public class StrAdv24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(int i = 0; i < s.length(); i++) {
            ++cnt[s.charAt(i)];
        }

        long ans = s.length();
        for(int i = 0; i < 256; i++) {
            ans += (long) cnt[i] * (cnt[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}
