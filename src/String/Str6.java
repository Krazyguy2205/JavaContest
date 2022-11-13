package String;

import java.util.Arrays;
import java.util.Scanner;

//sắp xếp các chữ số của N theo thứ tự tăng dần rồi in ra màn hình
//trong trường hợp số sau khi sắp xếp xuất hiện các chữ số 0 ở đầu thì ra không in những chữ số 0
public class Str6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] strArr = s.toCharArray();
		Arrays.sort(strArr);
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i] != '0' || i == strArr.length - 1) {
				System.out.print(strArr[i]);
			}
		}
	}
}
