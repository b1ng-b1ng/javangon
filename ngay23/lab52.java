package ngay23;

import java.util.Scanner;

public class lab52 {
    public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CHUONG TRINH QUAN LY CAN BO");
        
        int luaChon;
        do {
            System.out.println("\n=== MENU CHINH ===");
            System.out.println("1. Nhap thong tin can bo");
            System.out.println("2. Tim kiem can bo theo ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            
            luaChon = sc.nextInt();
            sc.nextLine(); // Đọc bỏ ký tự xuống dòng
            switch (luaChon) {
                case 1:
                    ql.nhap();
                    break;
                    
                case 2:
                    System.out.print("Nhap ten can bo can tim: ");
                    String tenCanTim = sc.nextLine();
                    ql.find(tenCanTim);
                    break;
                    
                case 3:
                    ql.inds();
                    break;
                    
                case 4:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                    
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon 1-4.");
            }
            
        } while (luaChon != 4);
        
        sc.close();
    }
}