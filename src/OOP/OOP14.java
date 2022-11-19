package OOP;

import java.util.Scanner;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        Point p = new Point(0, 0);
        p.x = sc.nextDouble();
        p.y = sc.nextDouble();
        return p;
    }

    public double getDistance(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}
public class OOP14 {
    private final Point a;
    private final Point b;
    private final Point c;

    public OOP14(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        return !(ab + ac <= bc) && !(ab + bc <= ac) && !(bc + ac <= ab) && !(ab <= 0) && !(bc <= 0) && !(ac <= 0);
    }

    public double getPerimeter() {
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        return ab + ac + bc;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            OOP14 a = new OOP14(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid())
                System.out.println("INVALID");
            else
                System.out.printf("%.3f %.3f", a.getPerimeter(), a.getArea());
            System.out.println();
        }
    }
}
