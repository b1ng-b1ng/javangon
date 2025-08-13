package ngay14;

public class SinhvienIT extends Sinhvien {
    private double diemJava ;
    public SinhvienIT(double diemJava, double diemHTML) {
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
    }
    private double diemHTML;
    public double getDiemJava() {
        return diemJava;
    }
    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    public double getDiemHTML() {
        return diemHTML;
    }
    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }
    @Override
    double getDiem(){
        return (this.diemHTML*2 + this.diemHTML)/3;
    }
   
}
