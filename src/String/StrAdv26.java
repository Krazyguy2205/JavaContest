package String;

import java.util.Scanner;

public class StrAdv26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char tmp = s.charAt(0);
        int cnt = 1, max = (int)-1e9;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                ++cnt;
            } else {
                if(cnt > max) {
                    max = cnt;
                    tmp = s.charAt(i - 1);
                } else if(cnt == max) {
                    if(s.charAt(i - 1) > tmp) {
                        tmp = s.charAt(i - 1);
                    }
                }
                cnt = 1;
            }
        }

        for(int i = 1; i <= max; i++) {
            System.out.print(tmp);
        }
    }
}
