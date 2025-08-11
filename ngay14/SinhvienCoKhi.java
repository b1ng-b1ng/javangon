package ngay14;

public class SinhvienCoKhi  extends Sinhvien{
    private String Skill;

    public SinhvienCoKhi(String id, String name, double price, double tax, String skill) {
        super(id, name, price, tax);
        this.Skill = skill;
    }
    
     
}
