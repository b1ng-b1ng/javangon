package ngay23;

public class Nhanvien extends Canbo{
    private String cv;

    public Nhanvien(String ten, String ns, String sex, String address, String cv) {
        super(ten, ns, sex, address);
        this.cv = cv;
    }
    
}
