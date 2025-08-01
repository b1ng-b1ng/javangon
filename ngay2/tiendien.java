import java.util.Scanner;

public class tiendien {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh tien dien!");
        System.out.print("nhap vao so dien: ");
        Scanner nhap = new Scanner(System.in);
        int a = nhap.nextInt();
        if(a <= 100){
            int money = a * 1000;
            System.out.println("so tien dien: " + money);
        }
        else{
            int money = 100 * 1000 + (a - 100)*1500;
            System.out.println("so tien dien:" + money);
        }
        nhap.close();
    }
}
