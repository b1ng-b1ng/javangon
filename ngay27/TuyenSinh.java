package ngay27;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<Thisinh> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.print("Chon khoi thi (A/B/C): ");
        String k = sc.nextLine().toUpperCase();
        Thisinh ts = null;

        switch (k) {
            case "A":
                ts = new ThisinhKhoiA();
                break;
            case "B":
                ts = new ThisinhKhoiB();
                break;
            case "C":
                ts = new ThisinhKhoiC();
                break;
            default:
                System.out.println("Khong hop le!");
                return;
        }

        ts.nhap(sc);
        ds.add(ts);
        System.out.println("Them thi sinh thanh cong!");
    }

    public void hienthi() {
        for (Thisinh ts : ds) {
            ts.hienthi();
            System.out.println("--------------------");
        }
    }

    public void timkiem() {
        System.out.print("Nhap SBD can tim: ");
        String s = sc.nextLine();
        for (Thisinh ts : ds) {
            if (ts.getSbd().equalsIgnoreCase(s)) {
                ts.hienthi();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh!");
    }

    public void menu() {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem SBD");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    nhap();
                    break;
                case 2:
                    hienthi();
                    break;
                case 3:
                    timkiem();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Chon sai!");
            }
        }
    }
}
