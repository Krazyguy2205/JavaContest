package OOP;

import java.util.*;

public class OOP29 {
    private String maSV, hoTen, lop, email;

    public OOP29(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<OOP29> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maSv = sc.nextLine(),
                    hoTen = sc.nextLine(),
                    lop = sc.nextLine(),
                    email = sc.nextLine();
            arr.add(new OOP29(maSv, hoTen, lop, email));
        }

        arr.sort((o1, o2) -> {
            if (!Objects.equals(o1.getLop(), o2.getLop())) {
                return o1.getLop().compareTo(o2.getLop());
            } else {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });

        for(OOP29 x : arr) {
            System.out.println(x);
        }
    }
}
