import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap chieu rong di: ");
        int rong = nhap.nextInt();
        System.out.println("nhap chieu dai di:");
        int dai = nhap.nextInt();
        System.out.println("chu vi la :" + (dai + rong)*2);
        System.out.println("dien tich la: "+ dai * rong);
        System.out.println("canh nho nhat la: " + Math.min(rong, dai));
        nhap.close();
    }
}
