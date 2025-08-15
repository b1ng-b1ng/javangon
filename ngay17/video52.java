package ngay17;

import java.util.Scanner;

public class video52 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        while (true) {
            System.out.println("nhap so x: ");
            int x = nhap.nextInt();
             try {   
        System.out.println("ket qua 10/x = " + 1.0*(10 / x));
        } catch (Exception e) {
            System.out.println("run error with x = " + x);
        }
        }
       
    }
}
