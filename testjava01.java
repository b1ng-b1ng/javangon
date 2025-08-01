
import java.util.Scanner;
public class testjava01 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("first number: "+ Math.pow(2, 3));
        // hàm pow trả kiểu dữ lie
        int number = nhap.nextInt();
        System.out.println("Second number ");
        int number2 = nhap.nextInt();
        System.out.println("Min = " + Math.min(number, number2));
        nhap.close();
    }
}
