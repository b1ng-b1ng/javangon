package ngay27;

public class ThisinhKhoiA extends Thisinh {
    private final String khoi = "A";
    private final String mon = "Toan,Ly,Hoa";

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Khoi: " + khoi + " | Mon Thi: " + mon);
    }
}
