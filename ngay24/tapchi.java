package ngay24;

import java.util.Scanner;

public class tapchi extends tailieu {
    private int soPhathanh;
    private String thangPhathanh;
    public tapchi(){
        super();
    }
    public tapchi(String matl, String nameNxb, int soBan, int soPhathanh, String thangPhathanh) {
        super(matl, nameNxb, soBan);
        this.soPhathanh = soPhathanh;
        this.thangPhathanh = thangPhathanh;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("Nhap so phat hanh:");
        soPhathanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap thang phat hanh:");
        thangPhathanh = sc.nextLine();
    }
    @Override
    public void in(){
        System.out.print("**Tap chi");
        super.in();
        System.out.println("So phat hanh: " + soPhathanh +"|Thang phat hanh: " +thangPhathanh +"|");
        
    }
}
