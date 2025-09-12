package ngay25;

import java.util.Scanner;

public class KhachSan {
    private nguoi ng;       
    private int songaytro;
    private String loaiphong;
    private double giaphong;
    public KhachSan() {
        ng = new nguoi();
    }
      public void nhap(Scanner sc) {
        System.out.println("---Nhap thong tin khach tro ---");
        ng.nhap(sc);
        System.out.print("Nhap so ngay tro: ");
        songaytro = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap loai phong: ");
        loaiphong = sc.nextLine();
        System.out.print("Nhap gia phong: ");
        giaphong = Double.parseDouble(sc.nextLine());
    }
      public void hienthi() {
        System.out.println("===== Thong tin khach tro =====");
        ng.hienthi();
        System.out.println("So ngay tro: " + songaytro +
                " | Loai phong: " + loaiphong +
                " | Gia phong: " + giaphong);
    }
}