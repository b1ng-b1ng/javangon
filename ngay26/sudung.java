package ngay26;

public class sudung {
    /**
 * Lớp chính chứa phương thức main để chạy chương trình
 */
public class Main {
    public static void main(String[] args) {
        XuLyPhanSo xuLyPhanSo = new XuLyPhanSo();
        
        // Nhập danh sách phân số
        PhanSo[] danhSachPhanSo = xuLyPhanSo.nhapDanhSachPhanSo();
        
        // Hiển thị dạng tối giản
        xuLyPhanSo.hienThiDangToiGian(danhSachPhanSo);
        
        // Thực hiện các phép toán
        xuLyPhanSo.thucHienPhepToan(danhSachPhanSo);
        
        // Đóng scanner
        xuLyPhanSo.dongScanner();
    }
}
}
