import java.util.Scanner;
// giai pt ax + b = 0;
public class btlab02 {
    public static void main(String[] args) {
        System.out.println("chuong trinh giai pt bac 1");
        Scanner nhap = new Scanner(System.in);
        System.out.println("moi ban nhap a:");
        int a = nhap.nextInt();
        System.out.println("moi ban nhap b: ");
        int b = nhap.nextInt();
        if ( a == 0 && b == 0){
            System.out.println("pt vo so nghiem");
        }
        else if (a == 0 && b != 0 ){
            System.out.println("pt vo nghiem");
        }
        else {
            double x = -1.0*b/a; 
            System.out.println("pt co nghiem la: " + x);
        }
        nhap.close();
    }
}
