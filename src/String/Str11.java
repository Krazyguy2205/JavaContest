package String;

//Cho ngày sinh của một người theo dạng ngày/tháng/năm
//chuẩn hóa ngày sinh này về dạng dd/mm/yyyy
import java.util.Scanner;

public class Str11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		if (sb.charAt(1) == '/') {
			sb.insert(0, "0");
		}

		if (sb.charAt(4) == '/') {
			sb.insert(3, "0");
		}

		System.out.println(sb.toString());
	}
}
