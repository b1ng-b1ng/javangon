package ngay27;

public class ThisinhKhoiC extends Thisinh {
    private final String khoi = "C";
    private final String mon = "Van,Su,Dia";

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Khoi: " + khoi + " | Mon thi: " + mon);
    }
}
