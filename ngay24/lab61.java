package ngay24;

import java.util.Scanner;

public class lab61 {
    public static void main(String[] args) {
        qlySach ql = new qlySach();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Chuong trinh quan ly tai lieu!");
        int lc;
        do{
            System.out.println("====MENU====");
            System.out.println("1.Nhap them tai lieu.");
            System.out.println("2.In ra danh sach tai lieu");
            System.out.println("3.Tim kiem theo loai");
            System.out.println("4.Thoat Chuong trinh!");
            System.out.print("NHap lua chon cua ban:");
            lc = nhap.nextInt();
            switch (lc) {
                case 1:
                    ql.nhap();
                    break;
                case 2:
                ql.in();
                break;
                case 3:
                System.out.println("Nhap loai ban muon tim:");
                System.out.println("1.Sach");
                System.out.println("2.Tap chi");
                System.out.println("3.Bao");
                int loai;
                loai = nhap.nextInt();
                nhap.nextLine();
                ql.find(loai);
                break;
                case 4:
                System.out.println("Thoat chuong trinh! , cam on da su dung");
                break;
                default:
                System.out.println("Lua chon khong hop le! Vui long chon 1-4.");
                    break;
            }
        }while(lc != 4);
        nhap.close();
    }
}
