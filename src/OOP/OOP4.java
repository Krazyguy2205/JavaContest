package OOP;

import java.util.Scanner;

public class OOP4 {
	private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;

	public OOP4(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue,
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
		StringBuilder sb = new StringBuilder(this.ngaySinh);
		StringBuilder sb2 = new StringBuilder(this.ngayKy);
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

	@Override
	public String toString() {
		return this.maNV + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " "
				+ this.maThue + " " + this.ngayKy;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OOP4 bai4 = new OOP4("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
				sc.nextLine());
		bai4.chuanHoa();
		System.out.println(bai4);
	}
}
