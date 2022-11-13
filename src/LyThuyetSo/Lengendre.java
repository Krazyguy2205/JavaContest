package LyThuyetSo;

import java.util.Scanner;

public class Lengendre {
	static long solve(int n, int p) {
		long res = 0;
		for(int i = p; i <= n; i += p) {
			//ptich xem trong boi cua p co bao nhieu so
			int tmp = i;
			while(tmp % p == 0) {
				++res;
				tmp /= p;
			}
		}
		return res;
	}

	//Cong thuc legendre
	static long solveLengendre(int n, int p) {
		long res = 0;
		for(int i = p; i <= n; i *= p) {
			res += n / i;
		}
		return res;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p = sc.nextInt();
		System.out.println(solve(n, p));
		System.out.println(solveLengendre(n, p));
	}
}
