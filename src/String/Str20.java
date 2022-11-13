package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//tách ra các từ thuận nghịch trong xâu và sắp xếp theo thứ tự từ điển tăng dần
public class Str20 {
	static boolean check(String s) {
		StringBuilder sb= new StringBuilder(s);
		return s.equals(sb.reverse().toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> arr = new ArrayList<>();
		String[] str = s.split("\\s+");
		for(String x : str) {
			if(check(x)) {
				arr.add(x);
			}
		}
		
		Collections.sort(arr);
		for(String x : arr) {
			System.out.print(x + " ");
		}
	}
}
