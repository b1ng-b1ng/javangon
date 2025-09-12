package ngay27;
import java.util.Scanner;

public class Thisinh {
    protected String sbd;
    protected String hoten;
    protected String diachi;
    protected int uutien;

    public Thisinh() {}

    public Thisinh(String sbd, String hoten, String diachi, int uutien) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.diachi = diachi;
        this.uutien = uutien;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap so bao danh: ");
        sbd = sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.print("Nhap muc uu tien: ");
        uutien = Integer.parseInt(sc.nextLine());
    }

    public void hienthi() {
        System.out.println("SBD: " + sbd + " | Ho Ten: " + hoten +
                " | Dia chi: " + diachi + " | Uu tien: " + uutien);
    }

    public String getSbd() {
        return sbd;
    }
}
