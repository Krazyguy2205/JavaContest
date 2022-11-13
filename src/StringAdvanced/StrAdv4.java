package StringAdvanced;

//tìm kí tự có số lần xuất hiện ít nhất và nhiều nhất trong xâu
//Trong trường hợp có nhiều kí tự có cùng số lần xuất hiện lớn nhất hoặc nhỏ nhất 
///in ra kí tự có thứ tự từ điển lớn nhất
import java.util.Scanner;

public class StrAdv4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] cnt = new int[256];
		for (char x : s.toCharArray()) {
			++cnt[x];
		}

		int minFre = Integer.MAX_VALUE;
		int maxFre = Integer.MIN_VALUE;
		char res1 = ' ';
		char res2 = ' ';
		for (int i = 0; i < 256; i++) {
			if (cnt[i] >= maxFre) {
				maxFre = cnt[i];
				res1 = (char)i;
			}

			if (cnt[i] != 0 && cnt[i] <= minFre) {
				minFre = cnt[i];
				res2 = (char)i;
			}
		}
		System.out.println(res1 + " " + maxFre);
		System.out.println(res2 + " " + minFre);
	}
}
