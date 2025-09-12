package ngay25;

import java.util.Scanner;

public class nguoi {
    private String hoten;
    private int tuoi;
    private int namsinh;
    private String cccd;
    public nguoi(){}
    public nguoi(String hoten, int tuoi, int namsinh, String cccd) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namsinh = namsinh;
        this.cccd = cccd;
    }
    public void nhap(Scanner sc){
        System.out.println("Nhap ho va ten:");
        this.hoten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nam sinh:");
        this.namsinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap can cuoc cong dan:");
        this.cccd = sc.nextLine();
    }
    public void hienthi() {
    System.out.println("Họ tên: " + hoten +
            " | Tuổi: " + tuoi +
            " | Năm sinh: " + namsinh +
            " | CMND: " + cccd);
}
}
