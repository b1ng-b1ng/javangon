package ngay23;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<Canbo> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public QLCB(){
        ds = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void find(String name){
        boolean tim = false;
        for (Canbo canbo : ds) {
            if(canbo.getTen().trim().equalsIgnoreCase(name)){
            System.out.print("Tim thay:");
            canbo.in();
            tim = true;
        }
         if(!tim){
                System.out.println("Khong tim thay Can bo: " + name);
            }
    }
}
    public void nhap() {
        System.out.println("Chon loai Can bo: ");
        System.out.println("1.Cong nhan");
        System.out.println("2.Ky su");
        System.out.println("3.Nhan vien");
        int lc;
        System.out.print("nhap lua chon cua ban:");
        lc = sc.nextInt();
        sc.nextLine();
        Canbo cb = null;
switch (lc) {
    case 1: cb = new Congnhan(); break;
    case 2: cb = new Kysu(); break;
    case 3: cb = new Nhanvien(); break;
    default: 
    System.out.println("Lua chon khong hop le!");
    return;
}
 cb.nhap(sc);
ds.add(cb);
}
    public void inds(){
        if(ds.isEmpty()){
            System.out.println("Danh sach rong!");
        }
        System.out.println("Danh sach can bo");
        for (int i = 0; i < ds.size(); i++) {
            Canbo cb = ds.get(i);
            System.out.println((i+1)+". ");
            cb.in();
        }
    }
}