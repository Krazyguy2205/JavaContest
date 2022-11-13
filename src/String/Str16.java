package String;

import java.util.Arrays;
import java.util.Scanner;

public class Str16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for(char x : arr) {
			System.out.print(x);
		}
		
		System.out.println();
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
