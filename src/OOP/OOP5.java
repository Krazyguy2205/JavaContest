package OOP;

import java.util.Scanner;

public class OOP5 {
	private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;

	public OOP5(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue,
			String ngayKy) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.maThue = maThue;
		this.ngayKy = ngayKy;
	}

	public void chuanHoa() {
		StringBuilder sb = new StringBuilder(this.ngaySinh), sb2 = new StringBuilder(this.ngayKy);
		if (sb.charAt(1) == '/') {
			sb.insert(0, "0");
		}

		if (sb.charAt(4) == '/') {
			sb.insert(3, "0");
		}

		this.ngaySinh = sb.toString();

		if (sb2.charAt(1) == '/') {
			sb2.insert(0, "0");
		}

		if (sb2.charAt(4) == '/') {
			sb2.insert(3, "0");
		}

		this.ngayKy = sb2.toString();
	}
	
	public void chuanHoaTen() {
		this.hoTen = this.hoTen.toLowerCase();
		String[] arr = this.hoTen.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
		}
		this.hoTen = sb.toString().trim();
	}
	
	@Override
	public String toString() {
		return this.maNV + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " "
				+ this.maThue + " " + this.ngayKy;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OOP5 bai5 = new OOP5("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		bai5.chuanHoa();
		bai5.chuanHoaTen();
		System.out.println(bai5);
	}
}