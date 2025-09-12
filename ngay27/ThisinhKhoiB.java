package ngay27;

public class ThisinhKhoiB extends Thisinh {
    private final String khoi = "B";
    private final String mon = "Toan,Hoa,Sinh";

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Khoi: " + khoi + " | Mon Thi: " + mon);
    }
}
