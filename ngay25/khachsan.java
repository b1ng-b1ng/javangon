package ngay25;

import java.util.ArrayList;
import java.util.Scanner;

public class khachsan extends nguoi {
    private int Songaytro;
    private String Loaiphong;
    private int gia;
    private ArrayList<khachsan> ds = new ArrayList<>();
    private Scanner sc;
    public khachsan(){
        ArrayList ds = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public khachsan(String name, int age, int ns, String cccd, int songaytro, String loaiphong, int gia) {
        super(name, age, ns, cccd);
        Songaytro = songaytro;
        Loaiphong = loaiphong;
        this.gia = gia;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.println("Nhap so ngay tro:");
        this.Songaytro = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Loai phong:");
        this.Loaiphong = sc.nextLine();
        System.out.println("Nhap gia");
        this.gia = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void in(){
        super.in();
        System.out.println("So ngay tro:"+ Songaytro +"|loai phong:" +Loaiphong +"|Gia phong:" + gia);
    }
    public static void main(String[] args) {
        
    }
}