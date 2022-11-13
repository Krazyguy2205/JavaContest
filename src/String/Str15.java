package String;
//đối với những từ xuất hiện ở vị trí lẻ thì in ra từ đó
//những từ xuất hiện ở vị trí chẵn thì trước khi in từ đó phải lật ngược từ đó trước

import java.util.Scanner;

public class Str15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.print(arr[i] + " ");
			} else {
				StringBuilder sb = new StringBuilder(arr[i]);
				System.out.print(sb.reverse().toString() + " ");
			}
		}
	}
}
