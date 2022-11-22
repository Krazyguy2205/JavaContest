package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OOP27 {
    private final String username;
    private final String password;
    private final String hoTen;
    private final String gioVao;
    private final String gioRa;

    public OOP27(String username, String password, String hoTen, String gioVao, String gioRa) {
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public int getHour(String time) {
        return (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
    }

    public int getMinute(String time) {
        return (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }

    public int getTime() {
        return getHour(this.gioRa) * 60 + getMinute(this.gioRa) - getHour(this.gioVao) * 60 - getMinute(this.gioVao);
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        int hour, minute;
        int hourIn = getHour(this.gioVao);
        int hourOut = getHour(this.gioRa);
        int minIn = getMinute(this.gioVao);
        int minOut = getMinute(this.gioRa);
        if(minOut >= minIn) {
            hour = hourOut - hourIn;
            minute = minOut - minIn;
        } else {
            hour = hourOut - hourIn - 1;
            minute = minOut + 60 - minIn;
        }
        return this.username + " " + this.password + " " + this.hoTen + " " + hour + " gio " + minute + " phut ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<OOP27> net = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String username = sc.nextLine(),
                    password = sc.nextLine(),
                    hoTen = sc.nextLine(),
                    gioVao = sc.nextLine(),
                    gioRa = sc.nextLine();
            net.add(new OOP27(username, password, hoTen, gioVao, gioRa));
        }

        Collections.sort(net, new Comparator<OOP27>() {
            @Override
            public int compare(OOP27 o1, OOP27 o2) {
                int time1 = o1.getTime();
                int time2 = o2.getTime();
                if(time1 != time2) return time2 - time1;
                else return o1.getUsername().compareTo(o2.getUsername());
            }
        });

        for(OOP27 x : net) {
            System.out.println(x);
        }
    }
}
