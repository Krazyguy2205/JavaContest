package OOP;

import java.util.*;

public class Pair {
    private final int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Pair(x, y));
        }

        arr.sort(Comparator.comparingInt(o -> o.second));

        int ans = 1, endTime = arr.get(0).second;
        for(int i = 1; i < n; i++) {
            if(endTime < arr.get(i).first) {
                ++ans;
                endTime = arr.get(i).second;
            }
        }
        System.out.println(ans);
    }
}
