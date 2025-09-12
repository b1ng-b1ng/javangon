package ngay26;

public class PhanSo {
    private int tuSo;    // Tử số của phân số
    private int mauSo;   // Mẫu số của phân số (khác 0)
    
    /**
     * Constructor mặc định, khởi tạo phân số 0/1
     */
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    /**
     * Constructor với tham số
     */
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = (mauSo != 0) ? mauSo : 1; // Tránh mẫu số bằng 0
    }
    
    // Getter và Setter
    public int getTuSo() {
        return tuSo;
    }
    
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    
    public int getMauSo() {
        return mauSo;
    }
    
    public void setMauSo(int mauSo) {
        this.mauSo = (mauSo != 0) ? mauSo : 1; // Tránh mẫu số bằng 0
    }
    
    /**
     * Tìm ước chung lớn nhất của hai số bằng thuật toán Euclid
     */
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * Kiểm tra phân số có phải là tối giản hay không
     * @return true nếu phân số tối giản, false nếu ngược lại
     */
    public boolean isToiGian() {
        return UCLN(tuSo, mauSo) == 1;
    }
    
    /**
     * Rút gọn phân số về dạng tối giản
     * @return Phân số đã được rút gọn
     */
    public PhanSo toiGian() {
        int u = UCLN(tuSo, mauSo);
        int tuMoi = tuSo / u;
        int mauMoi = mauSo / u;
        
        // Xử lý dấu của phân số (mẫu số luôn dương)
        if (mauMoi < 0) {
            tuMoi = -tuMoi;
            mauMoi = -mauMoi;
        }
        
        return new PhanSo(tuMoi, mauMoi);
    }
    
    /**
     * Cộng hai phân số
     * @param other Phân số thứ hai
     * @return Kết quả phép cộng đã được rút gọn
     */
    public PhanSo cong(PhanSo other) {
        int tuMoi = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
    /**
     * Trừ hai phân số
     * @param other Phân số thứ hai
     * @return Kết quả phép trừ đã được rút gọn
     */
    public PhanSo tru(PhanSo other) {
        int tuMoi = this.tuSo * other.mauSo - other.tuSo * this.mauSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
    /**
     * Nhân hai phân số
     * @param other Phân số thứ hai
     * @return Kết quả phép nhân đã được rút gọn
     */
    public PhanSo nhan(PhanSo other) {
        int tuMoi = this.tuSo * other.tuSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
    /**
     * Chia hai phân số
     * @param other Phân số thứ hai
     * @return Kết quả phép chia đã được rút gọn
     */
    public PhanSo chia(PhanSo other) {
        int tuMoi = this.tuSo * other.mauSo;
        int mauMoi = this.mauSo * other.tuSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
    /**
     * Hiển thị phân số dưới dạng chuỗi
     * @return Chuỗi biểu diễn phân số
     */
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
