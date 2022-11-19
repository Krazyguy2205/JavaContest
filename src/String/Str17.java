package String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Str17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr, String::compareTo);
		
		for(String x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for(String x : arr) {
			System.out.print(x + " ");
		}
	}
}
