package OOP;

import java.util.Scanner;

//tính tích hai ma trận A cỡ n*m và ma trận B cỡ m*p
public class OOP18 {
    private final int n;
    private final int m;
    private final int[][] a;

    public OOP18(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public OOP18 mul(OOP18 b) {
        OOP18 res = new OOP18(this.n, b.m);
        for(int  i = 0; i < this.n; i++) {
            for(int j = 0; j < b.m; j++) {
                res.a[i][j] = 0;
                for(int k = 0; k < this.m; k++) {
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < this.n; i++) {
            for(int j = 0; j < this.m; j++) {
                res.append(this.a[i][j]).append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        OOP18 a = new OOP18(n, m);
        a.nextMatrix(sc);
        OOP18 b = new OOP18(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
