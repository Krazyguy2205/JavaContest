package FunctionAndNumberTheory;

import java.util.Scanner;

public class Func10 {
    //Đếm ước của số nguyên dương
    @SuppressWarnings("resource")
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long ans = 1;
		while(t-- > 0) {
			//int p = sc.nextInt(); //thua so ngto
			int e = sc.nextInt(); //so mu
			ans *= (e + 1);
			ans %= (1e9 + 7);
		}
		System.out.println(ans);
	}
}
