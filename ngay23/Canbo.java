package ngay23;

public class Canbo {
    private String ten;
    private String ns;
    private String sex;
    private String address;
    public String getTen() {
        return ten;
    }
    public String getNs() {
        return ns;
    }
    public String getSex() {
        return sex;
    }
    public String getAddress() {
        return address;
    }
    public Canbo(){
        
    }
    public Canbo(String ten, String ns, String sex, String address) {
        this.ten = ten;
        this.ns = ns;
        this.sex = sex;
        this.address = address;
    }
    
}
