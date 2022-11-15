package OOP;

import java.util.Scanner;

public class OOP7 {
	private double x, y;

	public OOP7(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double distance(OOP7 o1, OOP7 o2) {
		return Math.sqrt((long) (o2.getX() - o1.getX()) * (o2.getX() - o1.getX())
				+ (long) (o2.getY() - o1.getY()) * (o2.getY() - o1.getY()));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
			OOP7 p1 = new OOP7(x1, y1);
			OOP7 p2 = new OOP7(x2, y2);
			System.out.printf("%.4f\n", distance(p1, p2));
		}
	}
}
