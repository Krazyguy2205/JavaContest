package OOP;

import java.util.Scanner;

public class OOP3 {
	private String maSV, hoTen, lop, ngaySinh;
	private double gpa;

	public OOP3(String maSV, String hoTen, String lop, String ngaySinh, double gpa) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
		this.gpa = gpa;
	}

	public void chuanHoa() {
		StringBuilder sb = new StringBuilder(this.ngaySinh);
		if (sb.charAt(1) == '/') {
			sb.insert(0, "0");
		}

		if (sb.charAt(4) == '/') {
			sb.insert(3, "0");
		}

		this.ngaySinh = sb.toString();
	}

	@Override
	public String toString() {
		return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " "
				+ String.format("%.1f", this.gpa);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OOP3 bai3 = new OOP3("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
		bai3.chuanHoa();
		System.out.println(bai3);
	}
}
