package OOP;

import java.util.Scanner;

//Tính tích ma trận a cỡ n x m với ma trận chuyển vị của a
public class OOP19 {
    private final int n;
    private final int m;
    private final int[][] a;

    public OOP19(int n, int m) {
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

    public OOP19 trans() {
        OOP19 tran = new OOP19(this.m, this.n);
        for(int i = 0; i < this.m; i++) {
            for(int j = 0; j < this.n; j++) {
                tran.a[i][j] = this.a[j][i];
            }
        }
        return tran;
    }

    public OOP19 mul(OOP19 b) {
        OOP19 res = new OOP19(this.n, b.m);
        for(int i = 0; i < this.n; i++) {
            for (int j = 0; j < b.m; j++) {
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        OOP19 a = new OOP19(n, m);
        a.nextMatrix(sc);
        OOP19 b = a.trans();
        System.out.println(a.mul(b));
    }
}
