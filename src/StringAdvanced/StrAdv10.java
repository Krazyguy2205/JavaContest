package StringAdvanced;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class StrAdv10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		TreeSet<String> ts = new TreeSet<>();
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for (String x : arr) {
			ts.add(x);
			lhs.add(x);
		}

		for (String x : ts) {
			System.out.print(x + " ");
		}

		System.out.println();

		for (String x : lhs) {
			System.out.print(x + " ");
		}
	}
}
