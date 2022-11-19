package OOP;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class OOP17 {
    private final TreeSet<String> set;

    public OOP17(TreeSet<String> set) {
        this.set = set;
    }

    OOP17(String s) {
        this.set = new TreeSet<>();
        String[] arr = s.split("\\s+");
        this.set.addAll(Arrays.asList(arr));
    }

    public OOP17 union(OOP17 b) {
        TreeSet<String> hop = new TreeSet<>();
        hop.addAll(b.set);
        hop.addAll(this.set);
        return new OOP17(hop);
    }

    public OOP17 intersection(OOP17 b) {
        TreeSet<String> giao = new TreeSet<>();
        for(String x : b.set) {
            if(this.set.contains(x)) {
                giao.add(x);
            }
        }
        return new OOP17(giao);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(String x : this.set) {
            res.append(x).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP17 s1 = new OOP17(sc.nextLine());
        OOP17 s2 = new OOP17(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
