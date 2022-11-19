package OOP2;

class Person {
    private String name, ngaySinh, diaChi;

    public Person() {
    }

    public Person(String name, String ngaySinh, String diaChi) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return this.name + " " + this.ngaySinh + " " + this.diaChi;
    }
}

public class OOP2_1 extends Person{

}
