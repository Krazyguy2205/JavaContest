package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Str19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.toLowerCase().split("\\s+");
		HashSet<String> hs = new HashSet<>(Arrays.asList(arr));
		
		System.out.println(hs.size());
	}
}
