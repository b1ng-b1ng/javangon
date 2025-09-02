package ngay23;

import java.util.Scanner;

public class Nhanvien extends Canbo{
    private String cv;
    public Nhanvien(){
        super();
    }
    public Nhanvien(String ten, int ns, String sex, String address, String cv) {
        super(ten, ns, sex, address);
        this.cv = cv;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("nhap nganh:");
        this.cv = sc.nextLine();
    }
    @Override
    public void in(){
        System.out.print("|Nhan vien");
        super.in();
        System.out.println("*Nganh: " + cv);
    }
}
