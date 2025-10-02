package ngay26;

import java.util.Scanner;

public class XuLyPhanSo {
    private Scanner scanner;

    public XuLyPhanSo() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Nhập đúng 2 phân số từ người dùng
     * @return Mảng chứa 2 phân số
     */
    public PhanSo[] nhapHaiPhanSo() {
        PhanSo[] ds = new PhanSo[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhap phan so thu " + (i + 1) + ":");
            System.out.print("  Tu so: ");
            int tu = scanner.nextInt();
            System.out.print("  Mau so: ");
            int mau = scanner.nextInt();
            ds[i] = new PhanSo(tu, mau);
        }
        return ds;
    }

    /**
     * Hiển thị dạng tối giản của 2 phân số
     * @param ds Mảng chứa 2 phân số
     */
    public void hienThiDangToiGian(PhanSo[] ds) {
        System.out.println("\nDang toi gian cua hai phan so:");
        for (int i = 0; i < ds.length; i++) {
            PhanSo psToiGian = ds[i].toiGian();
            System.out.println("Phan so " + (i + 1) + ": " + ds[i] + " -> " + psToiGian);
        }
    }

    /**
     * Thực hiện cộng, trừ, nhân, chia giữa 2 phân số
    Mảng chứa 2 phân số
     */
    public void thucHienPhepToan(PhanSo[] ds) {
        if (ds.length == 2) {
            System.out.println("\n===  Cac phep toan giua hai phan so ===");
            PhanSo ps1 = ds[0];
            PhanSo ps2 = ds[1];
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