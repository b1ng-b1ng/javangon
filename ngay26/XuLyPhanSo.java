package ngay26;

import java.util.Scanner;

public class XuLyPhanSo {
    private Scanner scanner;
    
    public XuLyPhanSo() {
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Nhập danh sách phân số từ người dùng
     * @return Mảng các phân số
     */
public PhanSo[] nhapDanhSachPhanSo() {
        System.out.print("Nhap so luong phan so: ");
        int n = scanner.nextInt();
        PhanSo[] danhSachPhanSo = new PhanSo[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan so thu " + (i + 1) + ":");
            System.out.print("  Tu so: ");
            int tu = scanner.nextInt();
            System.out.print("  Mau so: ");
            int mau = scanner.nextInt();
            danhSachPhanSo[i] = new PhanSo(tu, mau);
        }
        
        return danhSachPhanSo;
    }
    
    /**
     * Hiển thị dạng tối giản của các phân số
     * @param danhSachPhanSo Mảng các phân số cần hiển thị
     */
    public void hienThiDangToiGian(PhanSo[] danhSachPhanSo) {
        System.out.println("\nDang toi gian cua cac phan so:");
        for (int i = 0; i < danhSachPhanSo.length; i++) {
            PhanSo psToiGian = danhSachPhanSo[i].toiGian();
            System.out.println("Phan so " + (i + 1) + ": " + danhSachPhanSo[i] + " -> " + psToiGian);
        }
    }
    
    /**
     * Thực hiện và hiển thị các phép toán giữa các phân số
     * @param danhSachPhanSo Mảng các phân số
     */
    public void thucHienPhepToan(PhanSo[] danhSachPhanSo) {
        if (danhSachPhanSo.length >= 2) {
            System.out.println("\n===  cac phep toan  ===");
            
            PhanSo ps1 = danhSachPhanSo[0];
            PhanSo ps2 = danhSachPhanSo[1];
            
            System.out.println("Phan so 1: " + ps1);
            System.out.println("Phan so 2: " + ps2);
            System.out.println("Cong: " + ps1.cong(ps2));
            System.out.println("Tru: " + ps1.tru(ps2));
            System.out.println("Nhan: " + ps1.nhan(ps2));
            System.out.println("Chia: " + ps1.chia(ps2));
        }
    }
    
    /**
     * Đóng scanner
     */
    public void dongScanner() {
        scanner.close();
    }
}