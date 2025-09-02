package ngay24;

import java.util.ArrayList;
import java.util.Scanner;

import ngay13.car;
import ngay5.songuyento;

public class qlySach {
    private Scanner sc;
    private ArrayList<tailieu> ds = new ArrayList<>();
    public qlySach(){
        sc = new Scanner(System.in);
        ds = new ArrayList<>();
    }
    public void nhap(){
        System.out.println("Ban muon them tai lieu nao?");
        System.out.println("1.Sach");
        System.out.println("2.Tap chi");
        System.out.println("3.Bao");
        int lc;
        System.out.println("Nhap lua chon cua ban:");
        lc = sc.nextInt();
        sc.nextLine();
        tailieu tl = null;
        switch (lc) {
            case 1:
            tl = new sach(); break;
            case 2:
            tl = new tapchi(); break;
            case 3:
            tl = new bao(); break;
            default:
            System.out.println("Lua chon khong hop le!");
            break;
        }
        tl.nhap(sc);
        ds.add(tl);
    }
    public void in(){
        if(ds.isEmpty()){
            System.out.println("Danh sach rong!");
        }
            System.out.println("Danh sach tai lieu");
        for (int i = 0; i < ds.size(); i++) {
            tailieu tl = ds.get(i);
            System.out.println((i+1)+".");
            tl.in();
        }
    }
}