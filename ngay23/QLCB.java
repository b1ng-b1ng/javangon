package ngay23;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<Canbo> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap ngay sinh: ");
        String ns = sc.nextLine();
        System.out.print("gioi tinh: ");
        String sex = sc.nextLine();
        System.out.print("dia chi: ");
        String address = sc.nextLine();
        Canbo cb = new Canbo(ten, ns, sex, address);
        ds.add(cb);
    }
    public void in(){
        System.out.println("Danh sach can bo ne: ");
        for (Canbo canbo : ds) {
            System.out.println("|Ten: "+ canbo.getTen() + "|Ngay sinh: " + canbo.getNs() + "|Gioi tinh: " +canbo.getSex() +"|Dia chi: " + canbo.getAddress() +"|");
        }
    }
    public void find(String name){
        boolean tim = false;
        for (Canbo canbo : ds) {
            if(canbo.getTen().trim().equalsIgnoreCase(name)){
            System.out.println("Tim thay: "+"|Ten: "+ canbo.getTen() + "|Ngay sinh: " + canbo.getNs() + "|Gioi tinh: " +canbo.getSex() +"|Dia chi: " + canbo.getAddress() +"|");
                tim = true;
            }
        }
         if(!tim){
                System.out.println("Khong tim thay Can bo: " + name);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB ql = new QLCB();
        System.out.println("Q5uan ly can bo");
        System.out.println("1.Nhap thong tin can bo");
        System.out.println("2.In ra thong tin can bo");
        System.out.println("3.Tim thong tin Can bo theo ten");
        System.out.println("4.Thoat chuong trinh!");
        int lc;
        while (true) {
        System.out.print("nhap lua chon cua ban:");
        lc = sc.nextInt();
        sc.nextLine();
        if(lc == 1){
            ql.nhap();
        }
        else if(lc == 2){
            ql.in();
        }
        else if(lc == 3){
            System.out.print("nhap ten can tim: ");
            String ten = sc.nextLine();
            ql.find(ten);
        }
        else if(lc == 4){
            System.out.println("Thoat chuong trinh!");
            break;
        }
        else{
          System.out.println("Lua chon khong hop le");  
        }
        }
        sc.close();
    }
}
