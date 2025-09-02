package ngay24;

import java.util.Scanner;

public class sach extends tailieu {
    private String nameTG;
    private int soTrang;
    public sach(){
        super();
    }
    public sach(String matl, String nameNxb, int soBan, String nameTG, int soTrang) {
        super(matl, nameNxb, soBan);
        this.nameTG = nameTG;
        this.soTrang = soTrang;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("Nhap ten tac gia:");
        this.nameTG = sc.nextLine();
        System.out.print("Nhap so trang:");
        this.soTrang = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void in(){
        System.out.print("**Sach");
        super.in();
        System.out.println("Tac gia: " +nameTG +"|So trang: "+soTrang + "|");
    }
}
