package OOP;

import java.util.Scanner;

public class OOP13 {
    private long x, y;

    public OOP13() {
    }

    public OOP13(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public OOP13 Cong(OOP13 b) {
        long tu, mau;
        mau = this.y * b.y;
        tu = this.x * b.y + this.y * b.x;
        return new OOP13(tu * tu, mau * mau);
    }

    public OOP13 Nhan(OOP13 b, OOP13 c) {
        long tu = this.x * b.x * c.x;
        long mau = this.y * b.y * c.y;
        return new OOP13(tu, mau);
    }

    public void rutGon() {
        long a = this.x, b = this.y;
        if(a < b) {
            long r = a;
            a = b;
            b = r;
        }

        while(b != 0) {
            long res = a % b;
            a = b;
            b = res;
        }

        this.y = this.y / a;
        this.x = this.x / a;
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            OOP13 A = new OOP13(sc.nextLong(), sc.nextLong());
            OOP13 B = new OOP13(sc.nextLong(), sc.nextLong());
            OOP13 C = A.Cong(B);
            OOP13 D = A.Nhan(B, C);
            C.rutGon();
            D.rutGon();
            System.out.print(C + " " + D);
            System.out.println();
        }
    }
}
