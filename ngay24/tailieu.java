package ngay24;

import java.util.Scanner;

public class tailieu {
    private String matl;
    private String nameNxb;
    private int soBan;
    public String getMatl() {
        return matl;
    }
    public void setMatl(String matl) {
        this.matl = matl;
    }
    public String getNameNxb() {
        return nameNxb;
    }
    public void setNameNxb(String nameNxb) {
        this.nameNxb = nameNxb;
    }
    public int getSoBan() {
        return soBan;
    }
    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    public tailieu(){}
    public tailieu(String matl, String nameNxb, int soBan) {
        this.matl = matl;
        this.nameNxb = nameNxb;
        this.soBan = soBan;
    }
    public void nhap(Scanner sc){
        System.out.print("nhap ma tai lieu: ");
        matl = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban:");
        nameNxb = sc.nextLine();
        System.out.print("Nhap So ban phat hanh:");
        soBan = sc.nextInt();
        sc.nextLine();
    }
    public void in(){
        System.out.print("|Ma: " + matl+"|Nha xuat ban: " + nameNxb+ "|So ban phat hanh: " + soBan+"|");
    }
}
