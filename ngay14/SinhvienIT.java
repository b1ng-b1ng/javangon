package ngay14;

public class SinhvienIT extends Sinhvien {
    private String language;
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public SinhvienIT(String language,String id, String name, double price, double tax){
        super(id,name,price,tax);
        this.language = language;
    }
    public void getMoney(){
        System.out.println("Run get money");
        this.info();
    }
    public void info(){
        System.out.println("run info from SinhvienIT");
    }
}
