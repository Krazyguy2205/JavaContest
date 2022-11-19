package StringAdvanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StrAdv11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		Arrays.sort(arr);
		for (String x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();

		Arrays.sort(arr, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length())
					return o1.length() - o2.length();
				else
					return o1.compareTo(o2);
			}
		});

		for (String x : arr) {
			System.out.print(x + " ");
		}
	}
}
