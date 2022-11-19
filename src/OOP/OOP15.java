package OOP;

import java.util.Scanner;
import java.util.TreeSet;

public class OOP15 {
    private final TreeSet<Integer> set;

    public OOP15(TreeSet<Integer> set) {
        this.set = set;
    }

    public OOP15(int[] a) {
        this.set = new TreeSet<>();
        for (int x : a) {
            assert false;
            this.set.add(x);
        }
    }

    public OOP15 intersection(OOP15 b) {
        TreeSet<Integer> giao = new TreeSet<>();
        for (int x : b.set) {
            if (this.set.contains(x)) {
                giao.add(x);
            }
        }
        return new OOP15(giao);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int x : this.set) {
            res.append(x).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        OOP15 s1 = new OOP15(a);
        OOP15 s2 = new OOP15(b);
        OOP15 s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
