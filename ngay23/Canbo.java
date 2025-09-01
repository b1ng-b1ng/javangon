package ngay23;

import java.util.Scanner;

public class Canbo {
    private String ten;
    private int ns;
    private String sex;
    private String address;
    public String getTen() {
        return ten;
    }
    public int getNs() {
        return ns;
    }
    public String getSex() {
        return sex;
    }
    public String getAddress() {
        return address;
    }
    public void in(){
        System.out.println("|Ten: "+ ten+ "|Nam sinh: " + ns + "|Gioi tinh: " +sex+"|Dia chi: " + address +"|");
    }
    public void nhap(Scanner sc){
        System.out.print("nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("nhap nam sinh: ");
        this.ns = sc.nextInt();
        System.out.print("nhap gioi tinh: " );
        this.sex = sc.nextLine();
        System.out.println("nhap dia chi: ");
        this.address = sc.nextLine();
    }
    public Canbo(){
        
    }
    public Canbo(String ten, int ns, String sex, String address) {
        this.ten = ten;
        this.ns = ns;
        this.sex = sex;
        this.address = address;
    }
    
}
