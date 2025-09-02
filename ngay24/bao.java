package ngay24;

import java.util.Scanner;

public class bao extends tailieu{
    private String ngayPhathanh;
    public bao(){
        super();
    }
    public bao(String matl, String nameNxb, int soBan, String ngayPhathanh) {
        super(matl, nameNxb, soBan);
        this.ngayPhathanh = ngayPhathanh;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("Nhap ngay phat hanh: ");
        ngayPhathanh = sc.nextLine();
    }
    @Override
    public void in(){
        System.out.print("**Bao");
        super.in();
        System.out.print("Ngay phat hanh: " +ngayPhathanh +"|");
    }
}
