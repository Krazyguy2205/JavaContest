package OOP;

import java.util.Scanner;

public class OOP8 {
    private double x, y;

    public OOP8() {
        super();
    }

    public OOP8(double x, double y) {
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

    public static double distance(OOP8 o1, OOP8 o2) {
        return Math.sqrt((long) (o2.getX() - o1.getX()) * (o2.getX() - o1.getX())
                + (long) (o2.getY() - o1.getY()) * (o2.getY() - o1.getY()));
    }

    public static boolean checkTriangle(double a, double b, double c) {
        return !(a + b <= c) && !(a + c <= b) && !(b + c <= a) && !(a <= 0) && !(b <= 0) && !(c <= 0);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                double xA = sc.nextDouble(),
                        yA = sc.nextDouble(),
                        xB = sc.nextDouble(),
                        yB = sc.nextDouble(),
                        xC = sc.nextDouble(),
                        yC = sc.nextDouble();
                OOP8 pA = new OOP8(xA, yA);
                OOP8 pB = new OOP8(xB, yB);
                OOP8 pC = new OOP8(xC, yC);

                double AB = distance(pA, pB);
                double BC = distance(pB, pC);
                double AC = distance(pA, pC);

                if (!checkTriangle(AB, BC, AC)) {
                    System.out.println("INVALID");
                } else {
                    //Heron's formula
                    double p = (AB + BC + AC) / 2;
                    System.out.printf("%.3f ", AB + BC + AC);
                    System.out.printf("%.3f", Math.sqrt(p * (p - BC) * (p - AC) * (p - AB)));
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
