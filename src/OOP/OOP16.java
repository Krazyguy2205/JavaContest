package OOP;

import java.util.Scanner;
import java.util.TreeSet;

public class OOP16 {
    private final TreeSet<Integer> set;

    public OOP16(TreeSet<Integer> set) {
        this.set = set;
    }

    public OOP16(int[] a) {
        this.set = new TreeSet<>();
        for(int x : a) {
            this.set.add(x);
        }
    }

    public OOP16 union(OOP16 b) {
        TreeSet<Integer> hop = new TreeSet<>();
        hop.addAll(b.set);
        hop.addAll(this.set);
        return new OOP16(hop);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int x : this.set) {
            res.append(x).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
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

            OOP16 s1 = new OOP16(a);
            OOP16 s2 = new OOP16(b);
            OOP16 s3 = s1.union(s2);
            System.out.println(s3);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
