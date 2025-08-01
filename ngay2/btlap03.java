import java.util.Scanner;
//giai pt ax*x + b*x + c =0;
public class btlap03 {
    public static void main(String[] args) {
                System.out.println("chuong trinh giai pt bac 2");

        double x1,x2;
        System.out.println("moi ban nhap a: ");
        Scanner nhap = new Scanner(System.in);
        int a = nhap.nextInt();
        System.out.println("moi ban nhap b");
        int b = nhap.nextInt();
        System.out.println("moi ban nhap c:");
        int c = nhap.nextInt();
        if( a == 0 ){
            if(b == 0){
                if( c == 0){
                System.out.println("phuong trinh vo so nghiem");
            }
            else{
                System.out.println("phuong trinh vo nghiem");
            }
        }
            else{
             x1 = - 1.0 * c/b;
            System.out.println("nghiem cua pt la:" + x1);
        }
        }
        else{
            double delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("pt vo  nghiem");
            }
            else if ( delta ==0){
                x1 = x2 = -b/2*a;
            }
            else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("nghiem x1: %.2f , nghiem x2: %.2f",x1,x2);
            }
        }
        nhap.close();
    }
}
