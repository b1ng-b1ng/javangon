import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
       System.out.println("nhap ten sinh vien: ");
        String ten = nhap.nextLine();
        System.out.println("nhap diem sinh vien: ");
        double diem = nhap.nextDouble();
        System.out.println("Sinh vien "+ ten + " co diem la: " + diem);
        nhap.close();
    }
}
