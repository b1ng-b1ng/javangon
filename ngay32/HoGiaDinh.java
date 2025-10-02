package ngay32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoGiaDinh {
    private List<Nguoi> dsNguoi;
    private int sonha;
    private int soThanhvien;
    public HoGiaDinh(){
        dsNguoi = new ArrayList<>();
    }
    public void Nhapthongtin(Scanner sc){
        System.out.println("Nhap so nha:");
        sonha =sc.nextInt(); sc.nextLine();
        System.out.println("Nhap so thanh vien trong ho gia dinh:");
        soThanhvien = sc.nextInt(); sc.nextLine();
        for(int i  = 0 ; i < soThanhvien;i++){
            Nguoi nguoi = new Nguoi();
            nguoi.Nhapthongtin(sc);
            dsNguoi.add(nguoi);
        }
    }
    public void Inthongtin(){
        System.out.println("Thong tin cua ho gia dinh co so nha:" + sonha);
        System.out.println("So thanh vien:" + soThanhvien);
        for (Nguoi nguoi : dsNguoi) {
            nguoi.Inthongtin();
        }
    }
}