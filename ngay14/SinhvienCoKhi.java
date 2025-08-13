package ngay14;

public class SinhvienCoKhi  extends Sinhvien{
   private double diemHTML;
   private double diemJava;
   public SinhvienCoKhi(double diemHTML, double diemJava) {
    this.diemHTML = diemHTML;
    this.diemJava = diemJava;
}
   public double getDiemHTML() {
    return diemHTML;
}
   public void setDiemHTML(double diemHTML) {
    this.diemHTML = diemHTML;
   }

   public double getDiemJava() {
    return diemJava;
   }

   public void setDiemJava(double diemJava) {
    this.diemJava = diemJava;
   }  
    @Override
    double getDiem() {
        return (this.diemHTML*2 + this.diemHTML)/3;
    }  
}
