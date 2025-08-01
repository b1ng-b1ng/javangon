package ngay3;
import java.util.Scanner;

public class swithcase {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<" );
        System.out.println("++ -------------------++");
        System.out.println("|1.Cộng                |");
        System.out.println("|2.Trừ                 |");
        System.out.println("|3.Kết thúc            |");
        System.out.println("++--------------------++");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là:");
        int lc = nhap.nextInt();
        switch (lc) {
            case 1:
                 System.out.println("Bạn đã lựa chọn phép cộng");
                break;
            case 2:
            System.out.println("Bạn đã lựa chọn phép trừ");
            break;
            default:
                        System.out.println("Kết Thúc chương trình !");
                    System.exit(0);
                break;
        }
        nhap.close();
    }
}
