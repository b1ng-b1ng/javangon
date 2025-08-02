package ngay5;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.print("moi nhap so N: ");
        n = nhap.nextInt();
        nhap.close();
        if( n < 2 ){
                System.out.println("N khong phai so nguyen to");
                return ;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i ++){
            if( n % i  == 0){
                System.out.println("N khong phai so nguyen to");
                return ;
            }
        }
        System.out.println("N la so nguyen to");
    }
}
