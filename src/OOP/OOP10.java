package OOP;

import java.util.Scanner;

public class OOP10 {
    private double x, y;

    public OOP10() {
        super();
    }

    public OOP10(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(OOP10 o1, OOP10 o2) {
        return Math.sqrt((long) (o2.getX() - o1.getX()) * (o2.getX() - o1.getX())
                + (long) (o2.getY() - o1.getY()) * (o2.getY() - o1.getY()));
    }

    public static boolean checkTriangle(double a, double b, double c) {
        return !(a + b <= c) && !(a + c <= b) && !(b + c <= a) && !(a <= 0) && !(b <= 0) && !(c <= 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double xA = sc.nextDouble(),
                    yA = sc.nextDouble(),
                    xB = sc.nextDouble(),
                    yB = sc.nextDouble(),
                    xC = sc.nextDouble(),
                    yC = sc.nextDouble();
            OOP10 pA = new OOP10(xA, yA);
            OOP10 pB = new OOP10(xB, yB);
            OOP10 pC = new OOP10(xC, yC);

            double AB = distance(pA, pB);
            double BC = distance(pB, pC);
            double AC = distance(pA, pC);

            if (!checkTriangle(AB, BC, AC)) {
                System.out.println("INVALID");
            } else {
                double p = (AB + AC + BC) / 2;
                double S = Math.sqrt(p * (p - BC) * (p - AC) * (p - AB));
                double R = (AB * BC * AC) / (4 * S);
                double ans = 3.14 * R * R;
                System.out.printf("%.3f\n", ans);
            }
        }
    }
}
