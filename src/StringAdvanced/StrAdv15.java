package StringAdvanced;

import java.util.Scanner;

public class StrAdv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();
        if (s.contains(sub)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

