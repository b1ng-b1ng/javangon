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
     try {
        if(mauSo ==0){
            throw new IllegalArgumentException("Mau so khong duoc bang 0!");

        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
     } catch (Exception e) {
        System.out.println("ERROR " + e.getMessage());
      this.tuSo =0;
      this.mauSo =1;
     }
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
    try {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so khong duoc bang 0!");
        }
        this.mauSo = mauSo;
    } catch (IllegalArgumentException e) {
        System.out.println("WARNING: " + e.getMessage() + " Tu dong gan = 1.");
        this.mauSo = 1;
    }
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
    
    public boolean isToiGian() {
        return UCLN(tuSo, mauSo) == 1;
    }
    
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
    
  
    public PhanSo cong(PhanSo other) {
        int tuMoi = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
  
    public PhanSo tru(PhanSo other) {
        int tuMoi = this.tuSo * other.mauSo - other.tuSo * this.mauSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
    
    public PhanSo nhan(PhanSo other) {
        int tuMoi = this.tuSo * other.tuSo;
        int mauMoi = this.mauSo * other.mauSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }
    
 
    public PhanSo chia(PhanSo other) {
    try {
        if (other.tuSo == 0) {
            throw new ArithmeticException("Khong the chia cho phan so co tu so = 0!");
        }
        int tuMoi = this.tuSo * other.mauSo;
        int mauMoi = this.mauSo * other.tuSo;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    } catch (ArithmeticException e) {
        System.out.println("ERROR: " + e.getMessage());
        return new PhanSo(0, 1); // trả về 0/1 để tránh lỗi
    }
}

    
  
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
