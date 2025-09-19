package ngay26;

public class sudung {
    public static void main(String[] args) {
        XuLyPhanSo xuLyPhanSo = new XuLyPhanSo();

        // Nhập đúng 2 phân số
        PhanSo[] haiPhanSo = xuLyPhanSo.nhapHaiPhanSo();

        // Hiển thị dạng tối giản
        xuLyPhanSo.hienThiDangToiGian(haiPhanSo);

        // Thực hiện các phép toán
        xuLyPhanSo.thucHienPhepToan(haiPhanSo);

        // Đóng scanner
        xuLyPhanSo.dongScanner();
    }
}
