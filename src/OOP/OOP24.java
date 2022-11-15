package OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OOP24 {
	private String maSV, hoTen, lop, ngaySinh;
	private double gpa;

	public OOP24() {
		super();
	}

	public OOP24(int maSV, String hoTen, String lop, String ngaySinh, double gpa) {
		super();
		this.maSV = String.format("%03d", maSV);
		this.maSV = "SV" + this.maSV;
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
		this.gpa = gpa;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
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

		String[] arr = this.hoTen.split("\\s+");
		String res = "";
		for(String x : arr) {
			res += Character.toUpperCase(x.charAt(0));
			for(int i = 1; i < x.length(); i++) {
				res += Character.toLowerCase(x.charAt(i));
			}
			res += " ";
		}
		res = res.substring(0, res.length() - 1);
		this.hoTen = res;
	}

	@Override
	public String toString() {
		return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " "
				+ String.format("%.2f", this.gpa);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		OOP24[] arr = new OOP24[n];
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			arr[i] = new OOP24(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
			arr[i].chuanHoa();
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1.getGpa() != o2.getGpa()) {
				if (o1.getGpa() > o2.getGpa())
					return -1;
				else
					return 1;
			} else {
				return o1.getMaSV().compareTo(o2.getMaSV());
			}
		});

		for (OOP24 x : arr) {
			System.out.println(x);
		}
		sc.close();
	}
}
