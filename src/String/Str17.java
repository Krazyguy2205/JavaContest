package String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Str17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(String x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		for(String x : arr) {
			System.out.print(x + " ");
		}
	}
}
