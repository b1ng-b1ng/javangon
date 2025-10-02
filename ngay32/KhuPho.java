package ngay32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    private List<HoGiaDinh> dsHoGiaDinh;
    public KhuPho(){
        dsHoGiaDinh = new ArrayList<>();
    }
    int n = 0;
    public void Nhapthongtin(Scanner sc){
        System.out.println("Nhap so ho gia dinh:");
        n = sc.nextInt(); sc.nextLine();
        for(int i = 0 ;i < n;i++){
            HoGiaDinh hoGiaDinh = new HoGiaDinh();
            hoGiaDinh.Nhapthongtin(sc);
            dsHoGiaDinh.add(hoGiaDinh);
        }
    }
    public void Inthongtin(){
        for (HoGiaDinh hoGiaDinh : dsHoGiaDinh) {
            hoGiaDinh.Inthongtin();
        }
    }
}
