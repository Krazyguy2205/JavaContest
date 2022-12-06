package OOP2;

public class Person2 {
    private String ma;
    private String name;
    private String ngaySinh;
    private final String diaChi;

    public Person2() {
        name = ngaySinh = diaChi = "";
    }

    public Person2(String ma, String name, String ngaySinh, String diaChi) {
        this.ma = ma;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.name + " " + this.ngaySinh + " " + this.diaChi;
    }

    public void chuanHoa() {
        String[] arr = this.name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String x : arr) {
            res.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 1; i < x.length(); i++) {
                res.append(Character.toLowerCase(x.charAt(i)));
            }
            res.append(" ");
        }
        this.name = res.substring(0, res.length() - 1);

        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
}
