package OOP;

import java.util.Scanner;

public class OOP1 {
	private long tuSo, mauSo;

	public OOP1() {

	}
	
	public OOP1(long tuSo, long mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public long getTuSo() {
		return tuSo;
	}

	public void setTuSo(long tuSo) {
		this.tuSo = tuSo;
	}

	public long getMauSo() {
		return mauSo;
	}

	public void setMauSo(long mauSo) {
		this.mauSo = mauSo;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		tuSo = sc.nextLong();
		mauSo = sc.nextLong();
	}
	
	public long GCD(long a, long b) {
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public void reduceFraction(long a, long b) {
		long gcd = GCD(a, b);
		a = a / gcd;
		b = b / gcd;
		System.out.println(a + "/" + b);
	}
	
	public static void main(String[] args) {
		OOP1 bai1 = new OOP1();
		bai1.input();
		bai1.reduceFraction(bai1.getTuSo(), bai1.getMauSo());
	}
}
