package ngay30;

public class Nhanvien extends Person{
    private String bannganh;
    public int Luongcoban = 1000000;
    private double heSoLuong;
    
    public Nhanvien(String name, int age, double salary, String bannganh, int luongcoban, double heSoLuong) {
        super(name, age, salary);
        this.bannganh = bannganh;
        Luongcoban = luongcoban;
        this.heSoLuong = heSoLuong;
    }
    
    public String getBannganh() {
        return bannganh;
    }

    public void setBannganh(String bannganh) {
        this.bannganh = bannganh;
    }

    public int getLuongcoban() {
        return Luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        Luongcoban = luongcoban;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhluong(){
        return heSoLuong * Luongcoban;
    }
}